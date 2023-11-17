package libreria.Service;

import jakarta.persistence.NoResultException;
import libreria.Entity.Editorial;
import libreria.Entity.Libro;
import libreria.Persistence.DAO;
import libreria.Persistence.EditorialDAO;
import libreria.Persistence.LibroDAO;

import java.util.List;
import java.util.NoSuchElementException;

public class LibroService {

    private LibroDAO libroDAO;

    //Inicializamos en el constructor
    public LibroService (){
        libroDAO = new LibroDAO();
    }

    public void saveLibro (Libro libro){ //Ya no recibe un autor sino un objeto de tipo editorial para persistir
        libroDAO.save(libro);
    }

    public void removeLibro (Libro libro){
        libro.setAlta(false);
        libroDAO.update(libro);
    }

    public void updateLibro(Libro libro){
        libroDAO.update(libro);
    }

    public Libro findLibroByISBN(String isbn){
        return libroDAO.findById(Libro.class, isbn).orElseThrow(
                //Lambda, función anónima
                () -> new NoSuchElementException("Libro no encontrado"));

    }

    public Libro findLibroByTitulo(String titulo){
        try {
            return libroDAO.findByTitulo(titulo);
        }catch (NoResultException e){
            throw new NoSuchElementException("Libro no encontrado :(");
        }
    }

    public List<Libro> findLibrosByAutor(String nombreAutor){
        List<Libro> libros = libroDAO.findByAutor(nombreAutor);
        if (libros.isEmpty()){
            throw new NoSuchElementException("Libros no encontrados");
        }
        return libros;
    }

    public List<Libro> findLibrosByEditorial(String nombreEditorial){
        List<Libro> libros = libroDAO.findByEditorial(nombreEditorial);
        if (libros.isEmpty()){
            throw new NoSuchElementException("Libros no encontrados por editorial");
        }
        return libros;
    }

    public void closeResources(){
        libroDAO.closeResources();
    }

}
