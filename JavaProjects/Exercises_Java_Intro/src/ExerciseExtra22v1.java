import java.util.Random;

public class ExerciseExtra22v1 {
    public static void main(String[] args) {
        int N = 3; // Número de filas
        int M = 4; // Número de columnas

        int[][] matriz = new int[N][M];

        llenarMatrizAleatoria(matriz);

        int suma = calcularSumaMatriz(matriz);

        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }

    public static void llenarMatrizAleatoria(int[][] matriz) {
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(10); // Números aleatorios entre 0 y 9 (puedes ajustar el rango según tus necesidades)
            }
        }
    }

    public static int calcularSumaMatriz(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma += matriz[i][j];
            }
        }

        return suma;
    }
}
