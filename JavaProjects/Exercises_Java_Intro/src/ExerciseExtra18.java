import java.util.Scanner;

//Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
//        N, con los valores ingresados por el usuario

public class ExerciseExtra18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vector = new int[100]; //utilizamos New para crear una instancia (objeto) de una clase.

        int countVector = 0;


        // Rellenar el vector con los primeros 100 números enteros
        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;
            countVector += vector[i];
        }
        System.out.println("La suma del vector es: " + countVector);

    }
}
