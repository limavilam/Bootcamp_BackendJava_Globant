import java.util.Arrays;
import java.util.Scanner;

//EJERCICIO20:Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
//suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
//permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
//El programa deberá comprobar que los números introducidos son correctos, es decir,
//están entre el 1 y el 9.

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrixMagic = new int[3][3];

        System.out.println("Ingrese los números del cuadrado mágico:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixMagic[i][j] = scanner.nextInt();
                //Validar números
                if (matrixMagic[i][j] < 1 || matrixMagic[i][j] > 9) {
                    System.out.println("Los números deben estar entre 1 y 9. Intente nuevamente.");
                    return;
                }
            }
        }

        mostrarMatriz(matrixMagic);

        boolean isMagic = verificarCuadradoMagico(matrixMagic);

        if (isMagic) {
            System.out.println("El cuadrado es mágico.");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
    }

    // Método para mostrar una matriz.
    public static void mostrarMatriz(int[][] matrixMagic) {
        for (int i = 0; i < matrixMagic.length; i++) {
            for (int j = 0; j < matrixMagic.length; j++) {
                System.out.print(matrixMagic[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean verificarCuadradoMagico(int[][] matrixMagic) {
        int sumaFila = 0;
        int sumaColumna = 0;
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;

        // Calcular la suma de la primera fila
        for (int i = 0; i < 3; i++) {
            sumaFila += matrixMagic[0][i];
        }

        // Verificar la suma de las filas
        for (int i = 1; i < 3; i++) {
            int sumaActual = 0;
            for (int j = 0; j < 3; j++) {
                sumaActual += matrixMagic[i][j];
            }
            if (sumaActual != sumaFila) {
                return false;
            }
        }

        // Verificar la suma de las columnas
        for (int i = 0; i < 3; i++) {
            int sumaActual = 0;
            for (int j = 0; j < 3; j++) {
                sumaActual += matrixMagic[j][i];
            }
            if (sumaActual != sumaFila) {
                return false;
            }
        }

        // Calcular la suma de la primera diagonal
        for (int i = 0; i < 3; i++) {
            sumaDiagonal1 += matrixMagic[i][i];
        }

        // Calcular la suma de la segunda diagonal
        for (int i = 0; i < 3; i++) {
            sumaDiagonal2 += matrixMagic[i][2 - i];
        }

        // Verificar la suma de las diagonales
        if (sumaDiagonal1 != sumaFila || sumaDiagonal2 != sumaFila) {
            return false;
        }

        return true;
    }
}
