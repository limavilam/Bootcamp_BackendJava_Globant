package com.NoticiasEgg.EggNews.servicios;

import com.NoticiasEgg.EggNews.entidades.Periodista;
import com.NoticiasEgg.EggNews.excepciones.MiException;
import com.NoticiasEgg.EggNews.repositorios.PeriodistaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PeriodistaServicio {

    @Autowired
    private PeriodistaRepositorio periodistaRepositorio;

    @Transactional(readOnly = true)
    public List<Periodista> lista(){
        List<Periodista> periodistas = new ArrayList<>();
        periodistas = periodistaRepositorio.findAll();
        return periodistas;
    }

    @Transactional(readOnly = true)
    public Optional<Periodista> getOne(String id){
        return periodistaRepositorio.findById(id);
    }

    @Transactional
    public void actualizar(String idUsuario,Integer sueldoMensual, String nombreUsuario, String password, String password2) throws Exception{

        validar(nombreUsuario,password, password2);

        Optional<Periodista> respuesta = getOne(idUsuario);

        if(respuesta.isPresent()){
            Periodista periodista = respuesta.get();

            periodista.setNombreUsuario(nombreUsuario);
            periodista.setPassword(new BCryptPasswordEncoder().encode(password));
            periodista.setActivo(Boolean.TRUE);
            periodista.setSueldoMensual(sueldoMensual);
            periodistaRepositorio.save(periodista);
        }

    }


    private void validar(String nombreUsuario,String password, String password2) throws MiException {
        if(nombreUsuario.isEmpty() || nombreUsuario==null){
            throw new MiException("El nombre no puede ser nulo o estar vacío");
        }
        if (password.isEmpty() || password == null || password.length() <= 5) {
            throw new MiException("La contraseña no puede estar vacía, y debe tener más de 5 dígitos");
        }
        if (!password.equals(password2)) {
            throw new MiException("Las contraseñas ingresadas deben ser iguales");
        }

    }

}
