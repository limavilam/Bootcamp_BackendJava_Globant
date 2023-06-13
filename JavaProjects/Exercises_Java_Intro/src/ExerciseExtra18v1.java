import java.util.Scanner;

public class ExerciseExtra18v1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int N = scanner.nextInt();

        int[] vector = new int[N];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        int suma = calcularSuma(vector);
        System.out.println("La suma de los elementos del vector es: " + suma);
    }

    public static int calcularSuma(int[] vector) {
        int suma = 0;

        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }

        return suma;
    }
}
