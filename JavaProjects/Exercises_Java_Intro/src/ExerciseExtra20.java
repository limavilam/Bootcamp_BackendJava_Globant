import java.util.Random;

public class ExerciseExtra20 {
    public static void main(String[] args) {
        int[] vector = new int[10]; // Tamaño del vector

        // Rellenar el vectorA con los primeros 6 números enteros
        for (int i = 0; i < 10; i++) {
            vector[i] = (int) (Math.random() * 10); //valores aleatorios de 1 a 10
        }

        imprimirVector(vector); // Llamada al procedimiento para imprimir el vector

    }

    public static void imprimirVector(int[] vector) {
        System.out.println("Elementos del vector:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vector[i]);
        }
    }
}
