package EjerciciosColecciones.Listas.EjercicioPeliculas.service;

import EjerciciosColecciones.Listas.EjercicioPeliculas.entity.Pelicula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ServicioPelicula {
    private ArrayList<Pelicula> peliculas;
    private Scanner scanner;

    public ServicioPelicula() {
        this.peliculas = new ArrayList<>();
        this.scanner = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearPelicula() {
        boolean continuar = true;

        while (continuar) {

            System.out.println("Ingrese el nombre de la película: ");
            String tituloPelicula = scanner.nextLine().toUpperCase();

            System.out.println("Ingrese el director de la película: ");
            String directorIngresado = scanner.nextLine().toUpperCase();

            System.out.println("Ingrese la duración de la película en horas: ");
            int duracionPelicula = scanner.nextInt();

            this.peliculas.add(new Pelicula(tituloPelicula, directorIngresado, duracionPelicula));

            System.out.println("¿Desea agregar otra película (S/N) ?");
            String respuestaIngreso = scanner.skip("\n").next().toUpperCase();
            if (respuestaIngreso.equals("N"))
                continuar = false;
            System.out.println();
        }

    }

    public void mostrarPeliculas() {
        // utilizo el FOREACH
        for (Pelicula unitariaPersona : peliculas) {
            System.out.println(unitariaPersona.toString());
        }
    }

    public void peliculasConDuracionMayorAUnaHora(){
        System.out.println("Las películas con mayor duración de 1 hora son: ");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
        System.out.println();
    }

    public void ordenarPeliculasPorDuracionMayorAMenor() {
        Collections.sort(peliculas, Comparator.comparingInt(Pelicula::getDuracion).reversed());

        System.out.println("Las películas ordenadas por duración (de mayor a menor):");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        System.out.println();
    }

    public void ordenarPeliculasPorDuracionMenorAMayor() {
        Collections.sort(peliculas, Comparator.comparingInt(Pelicula::getDuracion));
        System.out.println("Las películas ordenadas por duración (de menor a mayor)");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        System.out.println();
    }
    public void ordenarPeliculasPorTitulo() {
        Collections.sort(peliculas, (p1, p2) -> p1.getTitulo().compareToIgnoreCase(p2.getTitulo()));
        System.out.println("Las películas ordenadas por título (alfabéticamente)");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        System.out.println();
    }

    public void ordenarPeliculasPorDirector() {
        Collections.sort(peliculas, (p1, p2) -> p1.getDirector().compareToIgnoreCase(p2.getDirector()));
        System.out.println("Las películas ordenadas por director (alfabéticamente)");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        System.out.println();
    }
}
