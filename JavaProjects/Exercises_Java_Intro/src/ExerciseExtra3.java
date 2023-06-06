
import java.util.Scanner;

//EJERCICIO EXTRA3:Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
//Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.

public class ExerciseExtra3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        String words = scanner.nextLine().toLowerCase();

        if (words.equalsIgnoreCase("a") || words.equalsIgnoreCase("e") || words.equalsIgnoreCase("i") || words.equalsIgnoreCase("o") || words.equalsIgnoreCase("u")){
            System.out.print("La letra ingresada es una vocal");
            System.out.println();
        }else{
            System.out.println("La letra ingresada no es un vocal");
        }
    }
}

/*
// Verificar que la frase ingresada inicie con A.
        if (phrase.substring(0,1).equalsIgnoreCase("A") || phrase.substring(0,1).equalsIgnoreCase("a")){
                System.out.print("Correct");
                System.out.println(); //Le da el espacio
                } else {
                System.out.println("Incorrect. Try again.");
                }*/
