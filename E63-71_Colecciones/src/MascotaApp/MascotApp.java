package MascotaApp;

import MascotaApp.servicios.servicioMascota;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MascotApp {

    public static void main(String[] args){

        //Otra curiosidad de ArrayList

        String [] nombres = {"pepe", "pepa"};
        List<String> nombresList = new ArrayList(Arrays.asList(nombres));

        List<String> nombresList2 = new ArrayList();
        nombresList2.addAll(0,nombresList);

        String [] nombresArray = new String[5];

        //

        //Arrays

        for (int i = 0; i < nombresArray.length; i++){
            //Asigno la posición i y voy cambiando y guardando
            nombresArray[i] = "Chiquito " + (i+1);
        }
        // Ejemplo: (int i = 0; i < 10; i++), la salida del programa será incorrecta, quiero colocar cosas en la posición 5 y no existe esa posición.

        for (String var : nombresArray){
            System.out.println(var);
        }

        //Collections

        ArrayList <String> nombresArrayList = new ArrayList(); //Se encuentra en dimension cero.

        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");

        System.out.println(nombresArrayList.size()); // 3   Cuando pongo el punto puedo ver todos los métodos del ArrayList

        nombresArrayList.remove("Chiquito"); //Removemos uno de los objetos
        System.out.println(nombresArrayList.size());

        System.out.println(Integer.MAX_VALUE); //La máxima dimensión que soporta un array.

        //Video no.2: Usando ArrayList

        servicioMascota servicioDeMascota = new servicioMascota();
        //Creo dos mascotas
        servicioDeMascota.crearMascota();
        servicioDeMascota.crearMascota();
        //muestro las mascotas
        servicioDeMascota.mostrarMascostas();

        //servicioDeMascota.fabricaChiquitos(5);
        //servicioDeMascota.fabricaMascota(2);
        //servicioDeMascota.agregarMascota();
        servicioDeMascota.mostrarMascostas();

    }

}
