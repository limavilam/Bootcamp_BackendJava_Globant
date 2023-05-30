import java.util.Scanner;

//EJERCICIO3: Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
//en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a phrase:");
        String phrase = scanner.nextLine();

        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.toLowerCase());
    }
}
