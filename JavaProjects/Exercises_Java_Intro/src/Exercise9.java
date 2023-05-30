import java.util.Scanner;

//EJERCICIO9: Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
//diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
//la función Substring y equals() de Java.

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a phrases:");
        String phrase = scanner.nextLine();

        // Verificar que la frase ingresada inicie con A.
        if (phrase.substring(0,1).equalsIgnoreCase("A") || phrase.substring(0,1).equalsIgnoreCase("a")){
            System.out.print("Correct");
            System.out.println(); //Le da el espacio
        } else {
            System.out.println("Incorrect. Try again.");
        }
    }
}
