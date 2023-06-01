import java.util.Arrays;
import java.util.Scanner;

//EJERCICIO18: Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
//traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
//cambiando sus filas por columnas (o viceversa).

public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //matrix creation
        int[][] matrix = new int[4][4];

        // Rellenar la matriz con valores aleatorios
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // Valores aleatorios entre 0 y 9
            }
        }

        // Mostrar la matriz original
        System.out.println("original matrix:");
        showMatrix(matrix);

        // Obtener la matriz traspuesta
        int[][] traspuesta = matrixTraspuesta(matrix);

        // Mostrar la matriz traspuesta
        System.out.println("\nMatriz traspuesta:"); //Imprime en una línea separada.
        showMatrix(traspuesta);
    }

    // Método para mostrar una matriz.
    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    // Método para obtener la matriz traspuesta.
    public static int[][] matrixTraspuesta(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix.length;

        int[][] traspuesta = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                traspuesta[j][i] = matrix[i][j];
            }
        }
        return traspuesta;
    }
}

 /* otra manera de hacerlo
    int[][] matrixT = new int[4][4];

// Rellenar la matriz con valores aleatorios
        for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
        matrixT[j][i] = matrix[i][j];
        }
        }
        //Mostrar la matriz
        for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
        System.out.println("[" + matrixT[j][i] + "]");
        }
        System.out.println("");
        }*/