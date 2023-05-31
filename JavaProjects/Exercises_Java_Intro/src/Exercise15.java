import java.util.Scanner;

//Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
//muestre por pantalla en orden descendente.
public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vector = new int[100]; //utilizamos New para crear una instancia (objeto) de una clase.

        // Rellenar el vector con los primeros 100 números enteros
        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;
        }

        // Mostrar el vector en orden descendente
        System.out.println("Vector en orden descendente:");
        for (int i = 99; i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }
}
