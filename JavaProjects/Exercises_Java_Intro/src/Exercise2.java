import java.util.Scanner;

//EJERCICIO2:Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
//pantalla.

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String fullName = scanner.nextLine();

        System.out.println("The user name is:" + fullName);
    }
}
