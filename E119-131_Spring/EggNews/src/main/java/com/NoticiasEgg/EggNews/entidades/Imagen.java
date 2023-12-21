package com.NoticiasEgg.EggNews.entidades;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;


@Entity
public class Imagen {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid") //,strategy = "uuid2")
    private String id;
    private String mime;
    private String nombre;

    @OneToOne
    private Imagen image;

    //@Lob indica que el campo contenido es un campo de tipo byte[].
    // Los campos de tipo byte[] se utilizan para almacenar datos binarios,
    // como imágenes, archivos de audio o archivos de vídeo.
    //La anotación @Basic(fetch = FetchType.LAZY) indica que el campo contenido
    // se cargará de forma asíncrona. Esto significa que el campo no se cargará en memoria hasta que sea necesario.
    // En este caso, el campo contenido se utiliza para almacenar el contenido de una noticia.
    // El campo se cargará de forma asíncrona para evitar cargar grandes cantidades de datos en memoria de forma innecesaria.
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] contenido;

    public Imagen() {
    }

    public Imagen(String id, String mime, String nombre, Imagen image, byte[] contenido) {
        this.id = id;
        this.mime = mime;
        this.nombre = nombre;
        this.image = image;
        this.contenido = contenido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Imagen getImage() {
        return image;
    }

    public void setImage(Imagen image) {
        this.image = image;
    }

    public byte[] getContenido() {
        return contenido;
    }

    public void setContenido(byte[] contenido) {
        this.contenido = contenido;
    }
}
