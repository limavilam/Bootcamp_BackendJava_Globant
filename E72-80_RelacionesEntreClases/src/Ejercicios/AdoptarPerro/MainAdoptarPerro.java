package Ejercicios.AdoptarPerro;

import java.util.ArrayList;



public class MainAdoptarPerro {

    public static void main(String[] args) {

        Perro perro1 = new Perro("Mora", "Chihuahua", 2, "Pequeño");
        Perro perro2 = new Perro("Luna", "Beagle", 4, "Mediano");
        Perro perro3 = new Perro("Patikalvo", "Labrador", 2, "Grande");
        Perro perro4 = new Perro("Alaska", "Alaska malamun", 4, "Mediano");
        ArrayList<Perro> perros = new ArrayList<>();
        perros.add(perro1);
        perros.add(perro2);
        perros.add(perro3);
        perros.add(perro4);

        Persona persona1 = new Persona("Lina", "Avila", 28, 12345678, new ArrayList<>());
        Persona persona2 = new Persona("Raul", "Ramirez", 29, 87654321, new ArrayList<>());
        Persona persona3 = new Persona("Daniel", "Avila", 20, 1324563, new ArrayList<>());
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        ServicioAdopcionDePerros servicioAdopcionDePerros = new ServicioAdopcionDePerros(personas, perros);
        servicioAdopcionDePerros.menu();


    }

}
