package Ejercicios.AdoptarPerro;

public class Persona {

    String nombre;
    String apellido;
    int edad;
    int documento;
    Perro perro;

    public Persona(String nombre, String apellido, int edad, int documento, Ejercicios.AdoptarPerro.Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    public void mostrarInformacion() {
        System.out.println("Persona: " + nombre + " " + apellido);
        System.out.println("Documento: " + documento);
        System.out.println("Perro: " + perro.nombre + " (" + perro.raza + "), Edad: " + perro.edad + ", Tamaño: " + perro.tamanio);
    }
}
