package libreria.Persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import libreria.Entity.Autor;
import libreria.Entity.Editorial;
import libreria.Entity.Libro;

import java.util.List;

public class LibroDAO extends DAO<Libro> {

    public Libro findByTitulo(String titulo) {
        EntityManager em = getEntityManager();
        try {
            //String jpql = "SELECT l FROM Libro l WHERE l.titulo LIKE :titulo AND l.alta = true";
            String jpql = "SELECT l FROM Libro l WHERE l.titulo LIKE :titulo AND l.alta = true";
            TypedQuery<Libro> query = em.createQuery(jpql, Libro.class);
            query.setParameter("titulo", titulo);
            return query.getSingleResult();
        } finally {
            em.close();
        }
    }

    //Retornamos una lista de libros

    public List<Libro> findByAutor(String nombreAutor){
        EntityManager em = getEntityManager();
        try {
            //String jpql = "SELECT l FROM Libro l WHERE l.autor.nombre LIKE :nombreAutor AND l.alta = true";
            String jpql = "SELECT l FROM Libro l WHERE l.autor.nombre LIKE :nombreAutor AND l.alta=true";
            TypedQuery<Libro> query = em.createQuery(jpql, Libro.class);
            query.setParameter("nombreAutor", nombreAutor);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public List<Libro> findByEditorial(String nombreEditorial){
        EntityManager em = getEntityManager();
        try {
            //String jpql = "SELECT l FROM Libro l WHERE l.autor.nombre LIKE :nombreAutor AND l.alta = true";
            String jpql = "SELECT l FROM Libro l WHERE l.editorial.nombre LIKE :nombreEditorial AND l.alta=true";
            TypedQuery<Libro> query = em.createQuery(jpql, Libro.class);
            query.setParameter("nombreEditorial", nombreEditorial);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
}
