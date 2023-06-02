import java.util.Arrays;
import java.util.Scanner;

//EJERCICIO21: Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
//3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
//dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
//se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
//que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
//la matriz M en la cual empieza el primer elemento de la submatriz P.
public class Exercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Creación matriz principal.
        int[][] matrixPrincipal = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
                {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
                {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
                {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
                {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
                {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}
        };

        //Creación matriz que se va a buscar.
        int[][] matrixSecondary = {
                {44, 45, 46},
                {54, 55, 56},
                {64, 65, 66}
        };

        //Aún no tenemos las dimensiones de la matriz, razón por la cual, debemos encontrarlas:

        //Para la matrixPrincipal
        int n = matrixPrincipal.length;
        int m = matrixPrincipal.length;
        //Para la matrixSecondary
        int p = matrixSecondary.length;
        int q = matrixSecondary.length;

        //El siguiente paso es inicializar las varibles.
        boolean matrixFound = false;
        int starRow = 0;
        int starColumn = 0;

        for (int i = 0; i <= n - p; i++) { //con la resta se asegura que hayan suficientes filas para la matriz secundaria.
            for (int j = 0; j <= m - q; j++) {
                boolean matrixMatch = true;
                for (int k = 0; k < p; k++) { // contador de filas de la matriz secundaria, se pone en < p porque garantiza que el bucle se repetirá hasta que se hayan iterado todas las filas de p.
                    for (int l = 0; l < q; l++) {
                        if (matrixPrincipal[i + k][j + l] != matrixSecondary[k][l]) { //comparacion de cada elemento entre matrices.
                            matrixMatch = false;
                            break;
                        }
                    }
                    if (!matrixMatch) {
                        break;
                    }
                }
                if (matrixMatch) {
                    matrixFound = true;
                    starRow = i;
                    starColumn = j;
                    break;
                }
            }
            if (matrixFound) {
                break;
            }
        }
        if (matrixFound) {
            System.out.println("La matriz P está contenida en la matriz M.");
            System.out.println("Fila de inicio: " + starRow);
            System.out.println("Columna de inicio: " + starColumn);
        } else {
            System.out.println("La matriz P no está contenida en la matriz M.");
        }
    }
}