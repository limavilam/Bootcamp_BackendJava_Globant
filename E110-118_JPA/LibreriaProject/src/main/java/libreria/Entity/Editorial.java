package libreria.Entity;

import jakarta.persistence.*;

@Entity
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //usamos el objeto Long
    @Column(nullable = false, unique = true)
    private String nombre;
    @Column(nullable = false)
    private boolean alta;

    //Inicializamos las variables
    public Editorial() {
        this.alta = true;
    }

    public Editorial(String nombre) {
        this();
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return  nombre;
    }
}
