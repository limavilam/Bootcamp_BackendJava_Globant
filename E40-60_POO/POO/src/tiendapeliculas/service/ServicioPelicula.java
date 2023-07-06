package tiendapeliculas.service;

import tiendapeliculas.entity.Pelicula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ServicioPelicula {

    private ArrayList<Pelicula> peliculas;

    public ServicioPelicula(){
        this.peliculas = new ArrayList<>();
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public Pelicula crearPelicula() {
        Scanner scanner = new Scanner(System.in);
        String titulo;
        GeneroPelicula genero;
        int anio;
        int duracion;

        System.out.println("Ingresa el título de la película: ");
        titulo = scanner.nextLine();
        System.out.println("Ingrese el género de la película: ");
        try{
            genero = GeneroPelicula.valueOf(scanner.nextLine().toUpperCase());
        } catch (IllegalArgumentException exception){
            System.out.println("El genero no es valido, usando género Aventura por defecto");
            genero = GeneroPelicula.AVENTURA;
        }
        System.out.println("Ingresa el año: ");
        anio = scanner.nextInt();
        System.out.println("Ingresa la duración de la película");
        duracion = scanner.nextInt();

        Pelicula pelicula = new Pelicula(titulo,genero,anio,duracion);
        this.peliculas.add(pelicula);
        return pelicula;
    }

    public ArrayList<Pelicula> peliculasDisponibles(){
        return getPeliculas();
    }

    public List<Pelicula> peliculasDisponiblePorTitulo(String titulo){
        return this.peliculas.stream()
                .filter(pelicula -> pelicula.getTituloPelicula().toUpperCase().contains(titulo.toUpperCase()))
                .collect(Collectors.toList());
    }

    public List<Pelicula> peliculasDisponiblePorGenero(String genero){
        return this.peliculas.stream()
                .filter(pelicula -> pelicula.getGenero().name().equals(genero.toUpperCase()))
                .collect(Collectors.toList());
    }



}
