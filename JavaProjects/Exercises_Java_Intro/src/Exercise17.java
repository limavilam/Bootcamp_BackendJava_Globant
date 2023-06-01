import java.util.Arrays;
import java.util.Scanner;

//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
//de 2 dígitos, etcétera (hasta 5 dígitos).

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del vector: ");
        int longitudVector = scanner.nextInt();

        //vector creation
        int[] vector = new int[longitudVector];

        //Llenado del vector
        for (int i = 0; i < longitudVector; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            vector[i] = scanner.nextInt();
        }
        // Mostrar el vector: Los elementos del arreglo son convertidos a cadenas usando el método, String.valueOf(),
        System.out.println("Vector: " + Arrays.toString(vector));

        /*Mostrar el vector sin usar arrays.toString
        for (int i = 0; i < longitudVector; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");*/
    }
}

