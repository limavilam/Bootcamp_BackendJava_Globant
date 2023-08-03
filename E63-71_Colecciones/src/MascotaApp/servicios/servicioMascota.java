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

        mascota m = new mascota(nombre,apodo,tipo);

        mascotas.add(m);

        return m;
        //También podría return new mascota(nombre,apodo,tipo);

    }

    public void agregarMascota(mascota m){
        mascotas.add(m);
    }
    
    //Muestro las mascotas
    
    public void mostrarMascostas(){
        System.out.println("Las mascotas actuales de la lista de mascotas son");
        //for (String aux: mascotas) { //aux tomara la posición de cada uno de los elementos en la lista
        //    System.out.println(aux);
        //}

        //video 3: mascotas no es un tipo de String
        for (mascota aux: mascotas){
            System.out.println(aux.toString());
        }
        System.out.println("cantidad = " + mascotas.size());
    }


    /**
     *
     * @param cantidad equivale a la cantidad de mascotas a crear y
     *  añadir a la lista.
     *
     */

    //Crea mascotas, todos chiquitos.

    public void fabricaChiquitos(int cantidad){

        for (int i=0; i < cantidad; i++){
            //Creando las mascotas
            //También se puede escribir como mascota aux = new mascota("Fer", "chiquito", "beagle"))
            mascotas.add(new mascota("Fer", "chiquito", "beagle"));
        }
    }

    //Crea mascotas pidiendo datos por teclado.
    public void fabricaMascota(int cantidad){

        for(int i=0; i < cantidad; i++){
            mascota mascotaCreada = crearMascota();

            agregarMascota(mascotaCreada);

            System.out.println(mascotaCreada.toString());
        }
    }

    /*public void actualizarMascota(int index){
        mascota m = mascotas.get(index);
        m.setApodo("Roberto");
    }*/

    /*public void actualizarMascota(int index){
        mascota m = crearMascota();
        mascota.set(index,m);
    }*/

    //Aplicar Try and Catch
    public void actualizarMascota(int index) {

        if (index <= (mascotas.size()-1)){
            System.out.println(" ");
            System.out.println("---Actualizar---");
        }
        mascota m = crearMascota();
      //  mascota.set(index, m);
    //}else{
        System.out.println("El indice es erróneo");
    }

    public void eliminarMascota(int index){
        if (index <= (mascotas.size()-1)){
            mascotas.remove(index);  //Puede eliminarse con objeto o con indices
        }else{
        System.out.println("Fallo al eliminar.El indice es erróneo");
    }

    }



}
