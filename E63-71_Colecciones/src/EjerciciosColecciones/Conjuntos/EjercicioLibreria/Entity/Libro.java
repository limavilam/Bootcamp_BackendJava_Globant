package EjerciciosColecciones.Conjuntos.EjercicioLibreria.Entity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Libro {

    private String tituloLibro;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;

    HashSet<String> libros = new HashSet<>();

    public Libro() {
    }

    public Libro(String tituloLibro, String autor, int numeroEjemplares) {
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = 0;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }

    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }
    public boolean prestamo() {
        if (numeroEjemplares - numeroEjemplaresPrestados > 0) {
            numeroEjemplaresPrestados++;
            return true;
        }
        return false;
    }

    public boolean devolucion() {
        if (numeroEjemplaresPrestados > 0) {
            //Decrementa en uno la cantidad de ejemplares prestados. Esto representa la devolución exitosa de un ejemplar.
            numeroEjemplaresPrestados--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Título: " + tituloLibro +
                "\nAutor: " + autor +
                "\nEjemplares disponibles: " + (numeroEjemplares - numeroEjemplaresPrestados) +
                "\nEjemplares prestados: " + numeroEjemplaresPrestados + "\n";
    }


}
