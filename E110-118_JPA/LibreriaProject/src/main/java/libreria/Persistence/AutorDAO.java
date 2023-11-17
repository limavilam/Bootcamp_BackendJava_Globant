package libreria.Persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import libreria.Entity.Autor;

public class AutorDAO extends DAO<Autor> { //Herencia
    public Autor findByNombre(String nombre){
        EntityManager em = getEntityManager();
        try{
            //Consulta de base de datos, mostramos registros que realmente no hemos removido.
            //String jpql =  "SELECT a FROM Autor a WHERE a.nombre LIKE :nombre AND a.alta = true";
            //String jpql = "SELECT a FROM Autor a WHERE a.nombre LIKE CONCAT('%', :nombre, '%') AND a.alta = true";
            System.out.println("Parámetro nombre antes de consulta: [" + nombre + "]");

            String jpql = "SELECT a FROM Autor a WHERE TRIM(a.nombre) = :nombre";
            TypedQuery <Autor> query = em.createQuery(jpql, Autor.class); //Nos piden pasar una clase
            query.setParameter("nombre", nombre);
            return (Autor) query.getSingleResult();

            //Actualizar el valor con setParameter, versión antigua.
//            Query query = em.createQuery(jpql);
//            query.setParameter("nombre", nombre);
//            return (Autor) query.getSingleResult(); //No es recomendable usarlo si ya sabemos el tipo de entidad, en este caso autor.

        }finally {
            em.close();
        }


    }
    public static void main(String[] args) {
        AutorDAO autorDAO = new AutorDAO();

        // Nombre que deseo buscar
        String nombreABuscar = "J.K. Rowling";

        // Imprimir la consulta JPQL y el parámetro
        System.out.println("Buscando autor por nombre: " + nombreABuscar);


        try {
            Autor autorEncontrado = autorDAO.findByNombre(nombreABuscar);
            System.out.println("Autor encontrado: " + autorEncontrado);
        } catch (NoResultException e) {
            System.out.println("Autor no encontrado");
        }
    }
}


