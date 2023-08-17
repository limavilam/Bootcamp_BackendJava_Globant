package Ejercicios.AdoptarPerro;

import EjemplosGuía.MAOEjercicioEquipoFutbol.Jugador;

import java.util.ArrayList;

public class MainAdoptarPerro {

    public static void main(String[] args) {

        Perro perro1 = new Perro("Mora", "Chihuahua", 2, "Pequeño");
        Perro perro2 = new Perro("Luna", "Beagle", 4, "Mediano");

        Persona persona1 = new Persona("Lina", "Avila", 28, 12345678, perro1);
        Persona persona2 = new Persona("Raul", "Ramirez", 29, 87654321, perro2);

        persona1.mostrarInformacion();
        System.out.println();
        persona2.mostrarInformacion();
    }

}
