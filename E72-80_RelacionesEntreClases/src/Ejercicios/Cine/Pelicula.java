package Ejercicios.Cine;

public class Pelicula {

    private String titulo;
    private int duracion;
    private int edadMinima;
    private String director;
    private float precio;

    public Pelicula(String titulo, int duracion, int edadMinima, String director, float precio) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
        this.precio = precio;
    }

    //Necesito solo dos

    public int getEdadMinima() {
        return edadMinima;
    }

    public float getPrecio() {
        return precio;
    }
}
