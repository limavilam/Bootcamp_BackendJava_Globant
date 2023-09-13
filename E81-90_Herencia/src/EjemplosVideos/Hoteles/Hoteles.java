package EjemplosVideos.Hoteles;

import EjemplosVideos.Entidades.*;

import java.util.ArrayList;
import java.util.List;

public class Hoteles {

    public static void main(String[] args) {

        //Quiero crear un hotel con la cantidad de estrellas que quiero.
        //Lo hago

        //Si pongo la lista Hotel4, pasaría que ingresan solo los de jerarquias iguales o superiores.

        List<Hotel> hoteles = new ArrayList();

        //Lo instancio donde yo quiero que nazca.

        //Bajo el tipo de dato Double, poniendo la
        // d minúscula hace referencia a un Double,
        // sino sería un integer

        Hotel1 h1 = new Hotel1(1500d, 9d, 10);
        Hotel2 h2 = new Hotel2(2500d, 12d, 15);
        Hotel3 h3 = new Hotel3(3500d, 15d, 20);
        Hotel4 h4 = new Hotel4(5000d, 20d, 30);
        Hotel5 h5 = new Hotel5(10000d, 30d, 50);

        hoteles.add(h1);
        hoteles.add(h2);
        hoteles.add(h3);
        hoteles.add(h4);
        hoteles.add(h5);

        for (Hotel aux : hoteles) {

            //Objetos que estén bajo una herencia, está en un arbol de herencia
            // pero con base a cuál de las clases que estuvo la herencia.
            //Instanceof, ejemplo: ¿este es un hotel de 2 estrellas?, sí, entonces
            //Casteamos y podemos trabajar en el objeto con base a su origen.

            if (aux instanceof Hotel5) {
                //instanceof: Nos va a decir en base a que jerarquía nació.
                Hotel5 object = (Hotel5) aux; //casteo(convierto), tomo la variable aux de tipo hotel
                System.out.println("Soy un Hotel 5");
                continue;
            }

            if (aux instanceof Hotel4) {
                Hotel4 object = (Hotel4) aux;
                System.out.println("Soy un Hotel 4");
                continue;
            }

            if (aux instanceof Hotel3) {
                Hotel3 object = (Hotel3) aux;
                System.out.println("Soy un Hotel 3");
                continue;
            }

            if (aux instanceof Hotel2) {
                Hotel2 object = (Hotel2) aux;
                System.out.println("Soy un Hotel 2");
                continue;
            }

            if (aux instanceof Hotel1) {
                Hotel1 object = (Hotel1) aux;
                System.out.println("Soy un Hotel 1");
                continue;

                //Un hotel de 5 puede ser de 1,2,3 o 4 pero un hotel de 3 no puede ser de 4 o 5.
            }

        }

    }
}