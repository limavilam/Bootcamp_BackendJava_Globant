package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.AutorRepositorio;
import com.egg.biblioteca.repositorios.EditorialRepositorio;
import com.egg.biblioteca.repositorios.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class LibroServicio {

    //Lo que hacemos es avisar al servidor de apps que la variable va a ser inicializada por él
    @Autowired
    private LibroRepositorio libroRepositorio;

    @Autowired
    private AutorRepositorio autorRepositorio;

    @Autowired
    private EditorialRepositorio editorialRepositorio;

    @Transactional
    public void crearLibro(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException {

        validarLibro(isbn, titulo, ejemplares, idAutor, idEditorial);

        //Nota: si lanza una excepción el código de abajo no se puede ejecutar, no se persiste en la base de datos.

        Autor autor = autorRepositorio.findById(idAutor).get();//Devolver el autor que encuentra por ID para poder guardarlo en el que estamos instanciando.
        Editorial editorial = editorialRepositorio.findById(idEditorial).get();
        Libro libro = new Libro();

        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplares(ejemplares);
        libro.setAlta(new Date()); //Se instancia con la fecha que el objeto se crea
        libro.setAutor(autor);
        libro.setEditorial(editorial);

       //Llamamos a save que recibe una entidad por parámetro y la persiste en la base de datos
        libroRepositorio.save(libro);
    }

    //Crear un método que nos retorne la lista de libros
    //Esta lista se va a rellenar con lo que nos retorna el método repositorio.

    public List<Libro> ListarLibros(){

        List<Libro> libros = new ArrayList();
        libros = libroRepositorio.findAll();
        return libros;
    }

    //El método modificar esta vinculado a través del ID, tenemos que buscar el libro vinculado con el ID.
    public void modificarLibro(Long isbn,String titulo,String idAutor,String idEditorial,Integer ejemplares) throws MiException{

        validarLibro(isbn, titulo, ejemplares, idAutor, idEditorial);

        //¿Qué pasa si el ID que nos envían por parámetro tiene algún error o no existe?, para eso
        // JPA nos proeve de un Optional.
        //Esto es correcto pero pueden pasar lo mencionado arriba:
        // Libro libro = libroRepositorio.findById(isbn).get();

        Optional<Libro> respuesta = libroRepositorio.findById(isbn);
        //El optional es un objeto contenedor que puede o no contener un valor No nulo
        //Si el valor está presente devuelve true y nos puede retornar el valor con el get.
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);

        //Instanciamos un autor y una editorial.

        Autor autor = new Autor();
        Editorial editorial = new Editorial();

        if(respuestaAutor.isPresent()){
            autor = respuestaAutor.get();
        }

        if(respuestaEditorial.isPresent()){
            editorial = respuestaEditorial.get();
        }

        if (respuesta.isPresent()){
            Libro libro = respuesta.get();
            libro.setTitulo(titulo);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libro.setEjemplares(ejemplares);

            //Guardamos en la base de datos
            libroRepositorio.save(libro);

        }

    }

    //Para no repetir código creamos un nuevo método.

    private void validarLibro(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException {
        if (isbn == null){
            throw new MiException("El ISBN no puede ser nulo");
        }
        if (titulo.isEmpty() || titulo ==null){
            throw new MiException("El titulo no puede ser nulo o estar vacio");
        }
        if (ejemplares == null){
            throw new MiException("El número de ejemplares no puede ser nulo");
        }
        if (idAutor.isEmpty() || idAutor ==null){
            throw new MiException("El autor no puede ser nulo o estar vacio");
        }
        if (idEditorial.isEmpty() || idEditorial == null){
            throw new MiException("La información n no puede ser nulo o estar vacio");
        }
    }
}
