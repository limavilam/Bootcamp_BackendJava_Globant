package libreria.Service;

import jakarta.persistence.NoResultException;
import libreria.Entity.Autor;
import libreria.Entity.Libro;
import libreria.Persistence.AutorDAO;

import java.util.NoSuchElementException;

public class AutorService {

    private AutorDAO autorDAO;

    //Inicializamos el constructor.
    public AutorService(){
        autorDAO = new AutorDAO();
    }

    public void saveAutor(Autor autor){
        autorDAO.save(autor);
    }

    public void removeAutor (Autor autor){
         autor.setAlta(false);
         autorDAO.update(autor);
    }

    public void updateAutor(Autor autor){
        autorDAO.update(autor);
    }

    public Autor findAutorByNombre(String nombre){
        try{
            return autorDAO.findByNombre(nombre);
        } catch (NoResultException e){
            throw new NoSuchElementException("Autor no encontrado");
        }

    }
    public void closeResources(){
        autorDAO.closeResources();
    }

}
