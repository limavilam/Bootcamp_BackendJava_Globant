package EjerciciosColecciones.Conjuntos.EjercicioLibreria.Service;

import EjerciciosColecciones.Conjuntos.EjercicioLibreria.Entity.Libro;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;


public class ServicioLibro {

    Scanner scanner = new Scanner(System.in);

    HashSet<Libro> libros = new HashSet<>();

    public ServicioLibro() {
        this.libros = libros;
    }

    public HashSet<Libro> getLibros() {
        return libros;
    }

    public void setLibros(HashSet<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro() {
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();

        System.out.print("Ingrese el número de ejemplares disponibles: ");
        int numEjemplares = scanner.nextInt();

        // Limpiamos el buffer después de leer el número entero. TipJuanMa
        scanner.nextLine();

        Libro nuevoLibro = new Libro(titulo, autor, numEjemplares);
        libros.add(nuevoLibro);
    }


    public void mostrarLibros() {
        System.out.println("\nLibros disponibles en la librería:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public boolean prestamo() {

        boolean prestamo = false;
        System.out.print("Ingrese el título del libro a prestar: ");
        String tituloPrestamo = scanner.nextLine();

        for (Libro libro : libros) {
            if (libro.getTituloLibro().equalsIgnoreCase(tituloPrestamo)) {
                if (libro.prestamo()) {
                    System.out.println("Libro prestado con éxito.");
                } else {
                    System.out.println("No quedan ejemplares disponibles para préstamo.");
                }
            }
        }
        return prestamo;
    }

    public boolean devolucion() {
        boolean devolucion = false;
        System.out.print("Ingrese el título del libro que desea devolver: ");
        String tituloRegresado = scanner.nextLine();

        for (Libro libro : libros) {
            if (libro.getTituloLibro().equalsIgnoreCase(tituloRegresado)) {
                if (libro.devolucion()) {
                    System.out.println("Libro regresado con éxito.");
                }
            }
        }
        return devolucion;
    }
}

