package Ejercicios.AdoptarPerro;

import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int documento;

    // Declaramos una lista de tipo perro para que una persona pueda tener más de un perro
    private ArrayList<Perro> perritosAdoptados;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public ArrayList<Perro> getPerritosAdoptados() {
        return perritosAdoptados;
    }

    public void setPerritosAdoptados(ArrayList<Perro> perritosAdoptados) {
        this.perritosAdoptados = perritosAdoptados;
    }

    public void agregarPerrito(Perro perro){
        this.perritosAdoptados.add(perro);
    }
    public Persona(String nombre, String apellido, int edad, int documento, ArrayList<Perro> perros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perritosAdoptados = perros;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", documento=" + documento +
                ", perro=" + perritosAdoptados +
                '}';
    }
}
