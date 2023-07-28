package EjerciciosColecciones.Listas.EjercicioAlumno.entidades;

import java.util.ArrayList;

public class Alumno {

    //Declaro los atributos

    private String nombre;
    private ArrayList<Integer> notas;

    //Constructores

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    //Getters and setters

    public String getNombre() {
        return nombre;
    }

    //No se usa
    /*public void setNombre(String nombre) {
        this.nombre = nombre;
    }*/

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    //No se usa
    /*public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }*/


    @Override
    public String toString() {
        return "Alumno {" + "nombre=" + nombre + ", notas=" + notas + '}';
    }
}
