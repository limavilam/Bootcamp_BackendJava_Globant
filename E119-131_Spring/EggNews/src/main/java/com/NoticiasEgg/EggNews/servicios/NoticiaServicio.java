package com.NoticiasEgg.EggNews.servicios;

import com.NoticiasEgg.EggNews.entidades.Imagen;
import com.NoticiasEgg.EggNews.entidades.Noticia;
import com.NoticiasEgg.EggNews.entidades.Periodista;
import com.NoticiasEgg.EggNews.repositorios.NoticiaRepositorio;
import com.NoticiasEgg.EggNews.excepciones.MiException;
import com.NoticiasEgg.EggNews.repositorios.PeriodistaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class NoticiaServicio {

    @Autowired
    private NoticiaRepositorio noticiaRepositorio;

    @Autowired
    private PeriodistaRepositorio periodistaRepositorio;
    @Autowired
    private ImagenServicio imagenServicio;

    @Transactional
    public void crearNoticia(Noticia noticia, MultipartFile archivo, String idPeriodista) throws Exception {

        validar(noticia, archivo);

        Optional<Periodista> respuestaPeriodista = periodistaRepositorio.findById(idPeriodista);

        Periodista periodista = new Periodista();

        if(respuestaPeriodista.isPresent()){
            periodista = respuestaPeriodista.get();
        }

        Imagen imagen = imagenServicio.guardar(archivo);

        noticia.setImagen(imagen);
        noticia.setCreador(periodista);
        noticia.setFechaPublicacion(new Date());

        noticiaRepositorio.save(noticia);
    }

    @Transactional
    public void modificarNoticia(Noticia noticia, MultipartFile archivo, String idPeriodista) throws Exception {

        validar(noticia, archivo);

        Optional<Noticia> respuestaNoticia = noticiaRepositorio.findById(noticia.getId());
        Optional<Periodista> respuestaPeriodista = periodistaRepositorio.findById(idPeriodista);

        Periodista periodista = new Periodista();

        Imagen imagen = imagenServicio.guardar(archivo);

        if(respuestaPeriodista.isPresent()){
            periodista = respuestaPeriodista.get();
        }

        if(respuestaNoticia.isPresent()){
            noticia.setImagen(imagen);
            noticia.setCreador(periodista);
        }

        noticiaRepositorio.save(noticia);
    }

    @Transactional(readOnly = true)
    public List<Noticia> listaNoticias(){
        List<Noticia> noticias = new ArrayList<>();
        noticias = noticiaRepositorio.findAll();
        return noticias;
    }

    public Optional<Noticia> getOne(String id){
        return noticiaRepositorio.findById(id);
    }

    private void validar(String titulo, String cuerpo, MultipartFile imagen) throws MiException {
        if(titulo.isEmpty() || titulo==null){
            throw new MiException("El título de la noticia no puede estar vacío");
        }
        if(cuerpo.isEmpty() || cuerpo==null){
            throw new MiException("El cuerpo de la noticia no puede estar vacío");
        }
        if(imagen.isEmpty() || imagen==null){
            throw new MiException("Debe cargar una imagen");
        }
    }

    private void validar(Noticia noticia, MultipartFile imagen) throws MiException {
        if(noticia.getTitulo().isEmpty() || noticia==null){
            throw new MiException("El título de la noticia no puede estar vacío");
        }
        if(noticia.getCuerpo().isEmpty() || noticia==null){
            throw new MiException("El cuerpo de la noticia no puede estar vacío");
        }
        if(imagen.isEmpty() || imagen==null){
            throw new MiException("Debe cargar una imagen");
        }
    }



}
