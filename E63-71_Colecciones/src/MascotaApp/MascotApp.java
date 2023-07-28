package MascotaApp;

import MascotaApp.servicios.servicioMascota;

import java.util.ArrayList;

public class MascotApp {

    public static void main(String[] args){
        String [] nombresArray = new String[5];

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
    }

}
