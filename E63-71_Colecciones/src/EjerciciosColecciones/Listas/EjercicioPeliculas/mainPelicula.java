package EjerciciosColecciones.Listas.EjercicioPeliculas;

import EjerciciosColecciones.Listas.EjercicioPeliculas.service.ServicioPelicula;

public class mainPelicula {
    public static void main(String[] args) {
        ServicioPelicula servicioPelicula = new ServicioPelicula();
        servicioPelicula.crearPelicula();

        servicioPelicula.mostrarPeliculas();
        System.out.println(" ");
        servicioPelicula.peliculasConDuracionMayorAUnaHora();
        System.out.println(" ");
        servicioPelicula.ordenarPeliculasPorDuracionMenorAMayor();
        System.out.println(" ");
        servicioPelicula.ordenarPeliculasPorDuracionMayorAMenor();
        System.out.println(" ");
        servicioPelicula.ordenarPeliculasPorTitulo();
        System.out.println(" ");
        servicioPelicula.ordenarPeliculasPorDirector();
    }
}

