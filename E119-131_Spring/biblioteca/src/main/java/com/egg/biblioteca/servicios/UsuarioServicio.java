package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Usuario;
import com.egg.biblioteca.enumeraciones.Rol;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.UsuarioRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServicio implements UserDetailsService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Transactional
    public void registrar(String nombre, String email, String password, String password2) throws MiException {
        validar(nombre, email, password, password2);

        //Instaciamos
        Usuario usuario = new Usuario();

        usuario.setNombre(nombre);
        usuario.setEmail(email);

        //Antes de usar el encoder: usuario.setPassword(password);
        //Usando el encoder.
        usuario.setPassword(new BCryptPasswordEncoder().encode(password)); //Eso se ve en el workbench.SELECT * FROM biblioteca.usuario;

        usuario.setRol(Rol.USER);

        usuarioRepositorio.save(usuario);

    }

    private void validar(String nombre, String email, String password, String password2) throws MiException {

        if (nombre.isEmpty() || nombre == null) {
            throw new MiException("el nombre no puede ser nulo o estar vacío");
        }
        if (email.isEmpty() || email == null) {
            throw new MiException("el email no puede ser nulo o estar vacio");
        }
        if (password.isEmpty() || password == null || password.length() <= 5) {
            throw new MiException("La contraseña no puede estar vacía, y debe tener más de 5 dígitos");
        }

        if (!password.equals(password2)) {
            throw new MiException("Las contraseñas ingresadas deben ser iguales");
        }

    }

    //Autenticar a cada usuario que se logea. Se implementa la Interfaz UserDetailsService
    //Lo vamos a autenticar con el email
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        //1. Buscar un usuario de nuestro dominio y transformarlo en un usuario del dominio de Spring Security
        //Hacemos uso del método del repo

        Usuario usuario = usuarioRepositorio.buscarPorEmail(email);

        //Empezamos a trabajar con Spring Security

        if (usuario != null) {
            List<GrantedAuthority> permisos = new ArrayList();

            //Creamos algunos permisos para un usuario
            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + usuario.getRol().toString()); //ROLE_USER

            // Ese p lo vamos a agregar a la lista creada previamente

            permisos.add(p);

            //Usamos la clase de Spring User, así vacío nos pide varios parámetros: User user = new User();
            //User user = new User(usuario.getEmail(), usuario.getPassword(), permisos);

            return new User(usuario.getEmail(), usuario.getPassword(), permisos);
        } else {

            return null;
        }
    }
}
