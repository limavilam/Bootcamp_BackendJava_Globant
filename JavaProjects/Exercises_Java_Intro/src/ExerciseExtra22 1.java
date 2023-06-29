import java.util.Scanner;

public class ExerciseExtra22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[2][3];

        int countVector = 0;

        // Rellenar la matriz con números aleatorios entre 0 y 9
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                countVector += matriz[i][j];
            }
        }

        System.out.println("La matriz es:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("La suma de la matriz es: " + countVector);
    }
}

