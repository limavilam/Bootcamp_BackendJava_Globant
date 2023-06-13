import java.util.Scanner;

public class ExerciseExtra22 {
    public ExerciseExtra22() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        int[][] matriz = new int[2][3];
        int countVector = 0;

        int i;
        int j;
        for(i = 0; i < 2; ++i) {
            for(j = 0; j < 3; ++j) {
                matriz[i][j] = (int)(Math.random() * 10.0);
                countVector += matriz[i][j];
            }
        }

        System.out.println("La matriz es:");

        for(i = 0; i < 2; ++i) {
            for(j = 0; j < 3; ++j) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("La suma de la matriz es: " + countVector);
    }
}

