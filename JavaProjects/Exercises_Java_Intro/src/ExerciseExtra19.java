import java.util.Scanner;

public class ExerciseExtra19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vectorA = new int[6];
        int[] vectorB = new int[6];

        // Rellenar el vectorA con los primeros 6 números enteros
        for (int i = 0; i < 6; i++) {
            vectorA[i] = (int) (Math.random() * 10); //valores aleatorios de 1 a 10
        }

        // Rellenar el vectorB con los primeros 6 números enteros
        for (int i = 0; i < 6; i++) {
            vectorB[i] = i + 1;
        }

        // Mostrar el vectorA en orden descendente
        System.out.println("VectorA en orden descendente:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(vectorA[i]);
        }

        // Mostrar el vectorB en orden descendente
        System.out.println("VectorB en orden descendente:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(vectorB[i]);
        }

        // Comparar si los vectores son iguales
        boolean sonIguales = true;
        for (int i = 0; i < 6; i++) {
            if (vectorA[i] != vectorB[i]) {
                sonIguales = false;
                break;
            }
        }

        if (sonIguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores son diferentes.");
        }

    }
}
