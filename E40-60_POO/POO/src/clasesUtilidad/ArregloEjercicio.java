package clasesUtilidad;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ArregloEjercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Vector A
        double[] vectorA = new double[50];
        //Vector B
        double[] vectorB = new double[20];

        // Rellenar el vector A con valores aleatorios
        for (double i = 0; i < vectorA.length; i++) {
            vectorA[(int) i] = random.nextDouble(); // Valores aleatorios
        }

        System.out.println("Vector A: " + Arrays.toString(vectorA));

        /*System.out.println("Vector en orden descendente:");
        for (int i = vectorA.length-1; i >= 0; i--) {
            System.out.println(vectorA[i]);
        }*/

        //Ordenar el vector de menor a mayor.
        Arrays.sort(vectorA);

        System.out.println("Vector A en orden descendente:" + Arrays.toString(vectorA));

        // Copiar los primeros 10 números ordenados del vector A al vector B
        for (int i = 0; i < 10; i++) {
            vectorB[i] = vectorA[i];
        }
        // Rellenar los 10 últimos elementos de vectorB con el valor 0.5
        for (int i = 10; i < 20; i++) {
            vectorB[i] = 0.5;
        }

        // Vector B combinado
        System.out.println("Vector B combinado:");
        System.out.println(Arrays.toString(vectorB));

    }
}
