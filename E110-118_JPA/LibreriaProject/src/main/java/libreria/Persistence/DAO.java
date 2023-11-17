package libreria.Persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import libreria.Entity.Libro;

import java.util.Optional;


//Toda la clase va a ser genérica
public abstract class DAO <E> {

    private final EntityManagerFactory emf;

    public DAO(){ //Constructor vacio para inicializar
        emf = Persistence.createEntityManagerFactory("defaultLibrary");
    }

    //Creo un método para cada vez que hacemos una transacción.
    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

    public void save (E entity){ //Puede ser cualquier expresión E, T, W, etc.
        EntityManager em = getEntityManager();
        try{
            //Operación que modifica la base de datos, damos inicio con begin
            em.getTransaction().begin();
            em.persist(entity); //objeto que queremos guardar en base de datos
            em.getTransaction().commit(); //Nos aseguramos que quede guardado, es un paso obligatorio

        }finally {
            em.close();
        }
    }

    public void update (E entity){
        EntityManager em = getEntityManager();
        try{
            //Operación que modifica la base de datos, damos inicio con begin
            em.getTransaction().begin();
            em.merge(entity); //objeto que queremos actualizar en base de datos.
            em.getTransaction().commit(); //Nos aseguramos que quede guardado, es un paso obligatorio

        }finally {
            em.close();
        }
    }

    public Optional <E> findById(Class<E> entityClass, Object id){
        EntityManager em = getEntityManager();
        try{
            return Optional.ofNullable(em.find(entityClass, id));

        }finally {
            em.close();
        }
    }

    public void closeResources(){
        emf.close();
    }
}

//Como el método se repite vamos a ponerlo en DAO, usaremos Generics
//Se implementa de forma génerica.
//    public <E> void save (E entity){ //Puede ser cualquier expresión E, T, W, etc.
//        EntityManager em = getEntityManager();
//        try{
//            //Operación que modifica la base de datos, damos inicio con begin
//            em.getTransaction().begin();
//            em.persist(entity); //objeto que queremos guardar en base de datos
//            em.getTransaction().commit(); //Nos aseguramos que quede guardado, es un paso obligatorio
//
//        }finally {
//            em.close();
//        }
//    }
