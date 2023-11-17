package libreria.Entity;

import jakarta.persistence.*;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Genera los Ids de la secuencia, Esto provoca que el contador de la
    // columna incremente en 1 cada vez que un nuevo objeto es insertado.
    private Long id;
    @Column(nullable = false, unique = true) //Nombres distintos y no repetido, no sea nulo, el nombre debe tener algún valor.
    private String nombre;
    @Column(nullable = false)
    private boolean alta;

    //Inicializamos las variables
    public Autor() {
        this.alta = true;
    }

    public Autor(String nombre) {
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
        return nombre;
    }
}
