package com.NoticiasEgg.EggNews.controladores;

import com.NoticiasEgg.EggNews.entidades.Noticia;
import com.NoticiasEgg.EggNews.servicios.NoticiaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/imagen")
public class ImagenControlador {

    @Autowired
    private NoticiaServicio noticiaServicio;

    @GetMapping("/noticia/{id}")
    public ResponseEntity<byte[]> imagenNoticia (@PathVariable("id") String id ){
        Optional<Noticia> respuestaNoticia = noticiaServicio.getOne(id);
        Noticia noticia = new Noticia();

        if(respuestaNoticia.isPresent()){
            noticia = respuestaNoticia.get();
            byte[] imagen = noticia.getImagen().getContenido();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_JPEG);

            return new ResponseEntity<>(imagen, headers, HttpStatus.OK);
        }
        return null;
    }
}

