package ejerciciosExtra;

import java.util.Scanner;

public class MainRaices {

    /*public static void conseguirValores(Raices valor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        valor.setA(scanner.nextDouble());
        System.out.println("Ingrese el valor de b: ");
        valor.setB(scanner.nextDouble());
        System.out.println("Ingrese el valor de c: ");
        valor.setC(scanner.nextDouble());
    }*/

    public static void main(String[] args){

        //Usando el constructor con parámetros

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de a: ");
        double a = scanner.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        double b = scanner.nextDouble();
        System.out.println("Ingrese el valor de c: ");
        double c = scanner.nextDouble();

        Raices raiz = new Raices(a, b, c);
        raiz.calcular();

        //Usando el método conseguir raices

        /*//Raices raiz = new Raices();

        conseguirValores(raiz);

        *//*System.out.println("El discriminante es:" + raiz.getDiscriminante());
        System.out.println("La ecuación tiene dos soluciones: " + raiz.tieneRaices());
        System.out.println("La ecuación tiene una solución: " + raiz.tieneRaiz());
        System.out.println("La solucion es: "+ raiz.obtenerRaiz());
        System.out.println("La ecuación tiene una solución: " + raiz.obtenerRaices());*//*

        //System.out.println(raiz.calcular());*/

    }
}
