package com.NoticiasEgg.EggNews.servicios;

import com.NoticiasEgg.EggNews.entidades.Noticia;
import com.NoticiasEgg.EggNews.entidades.Periodista;
import com.NoticiasEgg.EggNews.entidades.Usuario;
import com.NoticiasEgg.EggNews.enumeraciones.Rol;
import com.NoticiasEgg.EggNews.excepciones.MiException;
import com.NoticiasEgg.EggNews.repositorios.PeriodistaRepositorio;
import com.NoticiasEgg.EggNews.repositorios.UsuarioRepositorio;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicio implements UserDetailsService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private PeriodistaRepositorio periodistaRepositorio;

    public void actualizarRoleToPeriodista(Long id) {
        usuarioRepositorio.updateRoleToPeriodista(String.valueOf(id));
    }

    public void actualizarRoleToUsuario(Long id) {
        usuarioRepositorio.updateRoleToUsuario(String.valueOf(id));
    }


    @Transactional
    public void crearUsuario(String nombreUsuario, String password, String password2) throws Exception{
        validar(nombreUsuario, password,password2);

        Usuario usuario = new Usuario();
        usuario.setFechaDeAlta(new Date());
        usuario.setRol(Rol.USUARIO);
        usuario.setActivo(Boolean.TRUE);

        usuarioRepositorio.save(usuario);
    }

    @Transactional
    public void actualizar(String idUsuario, String nombreUsuario, String password, String password2) throws Exception{

        validar(nombreUsuario,password, password2);

        Optional<Usuario> respuesta = getOne(idUsuario);

        if(respuesta.isPresent()){
            Usuario usuario = respuesta.get();

            usuario.setNombreUsuario(nombreUsuario);
            usuario.setPassword(new BCryptPasswordEncoder().encode(password));
            usuario.setActivo(Boolean.TRUE);
            usuarioRepositorio.save(usuario);
        }

    }

    public Optional<Usuario> getOne(String id){
        return usuarioRepositorio.findById(id);
    }

    @Transactional(readOnly = true)
    public List<Usuario> listaUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios = usuarioRepositorio.findAll();
        return usuarios;
    }

    @Transactional(readOnly = true)
    public List<Periodista> listaPeriodistas(){
        List<Periodista> periodistas = new ArrayList<>();
        periodistas = periodistaRepositorio.findAll();
        return periodistas;
    }

    @Transactional(readOnly = true)
    public List<Noticia> listaNoticias(String id){
        List<Noticia> noticias = new ArrayList<>();
        noticias = periodistaRepositorio.findById(id).get().getMisNoticias();
        return noticias;
    }

    @Transactional
    public void cambiarRol(String id) throws Exception{
        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);

        if(respuesta.isPresent()){
            Usuario usuario = respuesta.get();

            if (!usuario.getRol().equals(Rol.ADMIN)){
                if (usuario.getRol().equals(Rol.USUARIO)) {

                    usuario.setRol(Rol.PERIODISTA);
                    usuarioRepositorio.updateRoleToPeriodista(id);

                } else if (usuario.getRol().equals(Rol.PERIODISTA)) {

                    usuario.setRol(Rol.USUARIO);
                    usuarioRepositorio.updateRoleToUsuario(id);
                }
            }else {
                throw new MiException("No se puede cambiar el rol de ADMIN");
            }
        }
    }

    @Transactional
    public void cambiarEstado(String id) throws Exception {
        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);

        if(respuesta.isPresent()){
            Usuario usuario = respuesta.get();

            if(!usuario.getRol().equals(Rol.ADMIN)) {
                if(usuario.getActivo().equals(Boolean.TRUE)){
                    usuario.setActivo(Boolean.FALSE);
                } else if (usuario.getActivo().equals(Boolean.FALSE)) {
                    usuario.setActivo(Boolean.TRUE);
                }
            }else{
                throw new MiException("No se puede cambiar el estado de ADMIN");
            }
        }
    }


    private void validar(String nombreUsuario,String password, String password2) throws MiException {
        if(nombreUsuario.isEmpty() || nombreUsuario==null){
            throw new  MiException("El nombre no puede ser nulo o estar vacío");
        }
        if (password.isEmpty() || password == null || password.length() <= 5) {
            throw new  MiException("La contraseña no puede estar vacía, y debe tener más de 5 dígitos");
        }
        if (!password.equals(password2)) {
            throw new MiException("Las contraseñas ingresadas deben ser iguales");
        }

    }


    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {

        Usuario usuario = usuarioRepositorio.buscarPorNombreUsuario(nombreUsuario);

        if(usuario!=null){

            List<GrantedAuthority> permisos = new ArrayList<>();

            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_"+ usuario. getRol().toString());

            permisos.add(p);

            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();

            HttpSession session = attr.getRequest().getSession(true);

            session.setAttribute("usuariosession", usuario);

            return new User(usuario.getNombreUsuario(), usuario.getPassword(), permisos);
        }else{
            return null;
        }
    }
}
