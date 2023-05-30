import java.util.Scanner;

//EJERCICIO6:Crear un programa que dado un numero determine si es par o impar.

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number entered is even"); //par
        }else{
            System.out.println("The entered number is odd"); //impar
        }
    }
}
