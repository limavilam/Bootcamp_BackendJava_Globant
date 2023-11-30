package com.egg.biblioteca.repositorios;

import com.egg.biblioteca.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//Extiende de JpaRepository manejando entidad libro cuya llave Id es de tipo de dato long
@Repository
public interface LibroRepositorio extends JpaRepository<Libro,Long> {

    //Método de buscar un libro

    @Query("SELECT l FROM Libro l WHERE l.titulo=:titulo")
    //El parametro titulo hace referencia al título atributo del libro y que el string titulo
    // hace referencia al titulo que le estoy pasando a la query
    public Libro buscarPorTitulo(@Param("titulo") String titulo);


    //Todos los libros que se relacionan a determinado autor, pueden haber más de 1 libro por autor
    @Query("SELECT l FROM Libro l WHERE l.autor.nombre=:nombre")
    public List<Libro> buscarPorAutor(@Param("nombre") String nombre);



}
