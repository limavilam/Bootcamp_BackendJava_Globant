import java.util.Scanner;

//Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
//usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
//pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
//Nota: investigar la función Lenght() en Java.
public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter only phrases or words 8 long:");
        String phrase = scanner.nextLine();

        // Verificar que la longitud esté correcta
        if (phrase.length() >=1 && phrase.length() <=8 ) {
            System.out.print("Correct");
            System.out.println(); //Le da el espacio
        } else {
            System.out.println("Incorrect. Try again.");
        }

    }
}
