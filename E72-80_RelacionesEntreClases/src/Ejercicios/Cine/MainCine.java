package Ejercicios.Cine;

public class MainCine {

    public static void main(String [] args){
        Simulador simulador = new Simulador();
        Pelicula pelicula = new Pelicula("Depredador",130,16,"No se quien",12000.0f);
        simulador.simular(pelicula,100);
        System.out.println(simulador.getAceptados());
        System.out.println(simulador.getProcesados());
        System.out.println(simulador.getRechazados());
    }
}
