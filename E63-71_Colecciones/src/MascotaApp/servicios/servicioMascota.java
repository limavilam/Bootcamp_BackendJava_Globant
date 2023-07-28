package MascotaApp.servicios;

import MascotaApp.entidades.mascota;

import java.util.ArrayList;
import java.util.Scanner;

public class servicioMascota {

    private Scanner scanner ;

    //private ArrayList<String> mascotas; //Puedo escribir List

    //Continuando video 3, crear un arraylist tipo mascota

    private ArrayList<mascota> mascotas;




    //Hacer un constructor que esta vacio e inicializarlo.
    public servicioMascota() {
        this.scanner = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }

    public mascota crearMascota(){

        System.out.println("Introducir nombre:");
        String nombre = scanner.next();

        System.out.println("Introducir apodo:");
        String apodo = scanner.next();

        System.out.println("Introducir tipo:");
        String tipo = scanner.next();

        //En lugar de devolverlo lo vamos guardando en el ArrayList
        
        String mascota = nombre + " " + apodo + " " + tipo ;
        
        //Cada vez que llame a crear mascota voy a ver un String guardado en mascota.
        //mascotas.add(mascota);

        return new mascota(nombre,apodo,tipo);


    }
    
    //Muestro las mascotas
    
    public void mostrarMascostas(){
        System.out.println("Las mascotas actuales de la lista de mascotas son");
        //for (String aux: mascotas) { //aux tomara la posición de cada uno de los elementos en la lista
        //    System.out.println(aux);
        //}
        //video 3:

        for (mascota aux: mascotas){
            System.out.println(aux.toString());
        }
        System.out.println("cantidad = " + mascotas.size());
    }

    public void fabricaMascotas(int cantidad){

    }
}
