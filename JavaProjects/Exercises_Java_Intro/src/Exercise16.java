import java.util.Arrays;
import java.util.Scanner;

//EJERCICIO16: Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
//usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//numero y si se encuentra repetido

public class Exercise16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int N = scanner.nextInt();

        // Crear el vector
        int[] vector = new int[N];

        // Rellenar el vector con valores aleatorios
        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 100); // Valores aleatorios entre 0 y 99
        }

        // Mostrar el vector
        System.out.println("Vector: " + Arrays.toString(vector));

        // Número a buscar
        System.out.print("Ingrese el número a buscar: ");
        int numeroBuscar = scanner.nextInt();

        // Buscar el número en el vector
        boolean encontrado = false;
        int primeraPosicion = -1;
        for (int i = 0; i < N; i++) {
            if (vector[i] == numeroBuscar) {
                if (!encontrado) { //Esto indica que es verdadero.
                    primeraPosicion = i;
                    encontrado = true;
                } else {
                    System.out.println("El número se encuentra repetido en las posiciones: " + primeraPosicion + " y " + i);
                }
            }
        }

        // Mostrar el resultado de la búsqueda
        if (encontrado) {
            System.out.println("El número se encuentra en la posición: " + primeraPosicion);
        } else {
            System.out.println("El número no se encuentra en el vector.");
        }
    }
}