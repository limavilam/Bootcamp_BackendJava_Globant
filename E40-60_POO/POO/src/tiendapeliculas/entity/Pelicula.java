package tiendapeliculas.entity;

import tiendapeliculas.service.GeneroPelicula;

public class Pelicula {

    private String tituloPelicula;
    private GeneroPelicula genero;
    private int anio;
    private int duracion;

    public Pelicula() {
    }

    public Pelicula(String tituloPelicula, GeneroPelicula genero, int anio, int duracion) {
        this.tituloPelicula = tituloPelicula;
        this.genero = genero;
        this.anio = anio;
        this.duracion = duracion;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public GeneroPelicula getGenero() {
        return genero;
    }

    public void setGenero(GeneroPelicula genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula: Titulo: "+this.tituloPelicula+", Año:"+this.anio+", Genero:"+this.genero
                +", Duracion:"+this.duracion;
    }
}

