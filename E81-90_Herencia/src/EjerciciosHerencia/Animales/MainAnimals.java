package EjerciciosHerencia.Animales;

import EjerciciosHerencia.Animales.EntidadesAnimales.Animal;
import EjerciciosHerencia.Animales.EntidadesAnimales.Perro;

public class MainAnimals {
    public static void main (String[] args){

        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro1.alimentarse();

        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentarse();

        //Si no le ponemos de qué se alimenta, no se muestra que come.

        Animal gato1 = new Perro("Pelusa", "Galletas", 15, "Siámes");
        gato1.alimentarse();

        Animal caballo1 = new Perro("Spark","Pasto", 25, "Fino");
        caballo1.alimentarse();
    }
}
