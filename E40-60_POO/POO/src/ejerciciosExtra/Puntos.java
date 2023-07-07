package ejerciciosExtra;

import java.util.Scanner;

public class Puntos {
    //Atributos

    private static double x1;
    private static double x2;
    private static double y1;
    private static double y2;

    //Constructores

    public Puntos() {
    }

    //Nunca se usó el constructor con parámetros.

    /*public Puntos(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }*/

    //Métodos set y get.

    public static double getX1(){
        return x1;
    }

    public void setX1(double x1){
        this.x1 = x1;
    }

    public static double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public static double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public static double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        Puntos.y2 = y2; //this.y2=y2 -->accessed via instance reference
    }

    //Metodo crearPuntos

    //el método crearPuntos() debe aceptar
    // un objeto Puntos como parámetro y lo utiliza para establecer los valores ingresados por el usuario.

    public static void crearPuntos(Puntos punto){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del punto x1: ");
        punto.setX1(scanner.nextDouble());
        System.out.println("Ingrese el valor del punto x2: ");
        punto.setX2(scanner.nextDouble());
        System.out.println("Ingrese el valor del punto y1: ");
        punto.setY1(scanner.nextDouble());
        System.out.println("Ingrese el valor del punto y2: ");
        punto.setY2(scanner.nextDouble());
    }

    public static double calcularDistancia(Puntos distancia){
        double distancias =  Math.sqrt(Math.pow((Puntos.getX2() - Puntos.getX1()),2) + (Math.pow((Puntos.getY2() - Puntos.getY1()),2)));
        return distancias;
    }

    public static void main(String[] args){
        Puntos punto1 = new Puntos(); //Tener cuidado con los parámetros del constructor.

        crearPuntos(punto1);
        System.out.println("La distancia de los puntos es: "+ calcularDistancia(punto1));
    }
}
