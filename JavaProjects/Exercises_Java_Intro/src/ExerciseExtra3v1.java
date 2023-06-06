import java.util.Scanner;

//EJERCICIO EXTRA3:Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
//Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.

public class ExerciseExtra3v1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una letra: ");
        String words = scanner.nextLine().toLowerCase();

        if (esVocal(words)) {
            System.out.println("La letra ingresada es una vocal.");
        } else {
            System.out.println("La letra ingresada no es una vocal.");
        }
    }

    public static boolean esVocal(String words) {
        return words.equals("a") || words.equals("e") || words.equals("i") || words.equals("o") || words.equals("u");
    }
}
