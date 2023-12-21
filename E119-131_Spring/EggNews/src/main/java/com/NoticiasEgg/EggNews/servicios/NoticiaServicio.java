package com.NoticiasEgg.EggNews.servicios;

import com.NoticiasEgg.EggNews.entidades.Noticia;
import com.NoticiasEgg.EggNews.repositorios.NoticiaRepositorio;
import com.NoticiasEgg.EggNews.excepciones.MiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NoticiaServicio {

    @Autowired
    NoticiaRepositorio noticiaRepositorio;


    @Transactional
    public void guardarNoticia(String nombre) throws MiException {

        validar(nombre);

        //Recordemos que el ID del autor es generada de manera automática

        Noticia noticia = new Noticia();
        noticia.setNoticia(nombre);
        noticiaRepositorio.save(noticia);

    }

    public List<Noticia> ConsultarNoticia(){

        List<Noticia> noticias = new ArrayList();
        noticias = noticiaRepositorio.findAll();
        return noticias;
    }

    public void modificarNoticia(String nombre, String id) throws MiException{

        validar(nombre);

        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);

        if(respuesta.isPresent()){
            Noticia noticia = respuesta.get();
            noticia.setNoticia(nombre);
            noticiaRepositorio.save(noticia);
        }
    }

    public void eliminarNoticia(String id)throws MiException {
        if (id == null) {
            throw new IllegalArgumentException("El id de la noticia no debe ser nulo");
        }

        Noticia noticia = noticiaRepositorio.findById(id).orElse(null);
        if (noticia == null) {
            throw new MiException("La noticia no existe");
        }

        noticiaRepositorio.deleteById(String.valueOf(id));
    }

    private void validar(String nombre) throws MiException {

        if (nombre.isEmpty() || nombre ==null){
            throw new MiException("El nombre de la noticia no puede ser nulo o estar vacío");
        }
    }



}
