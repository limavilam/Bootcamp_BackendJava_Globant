import java.util.Scanner;

//EJERCICIO1: Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
//dos. El programa deberá después mostrar el resultado de la suma

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number A:");
        int numberA = scanner.nextInt();

        System.out.println("Enter number B:");
        int numberB = scanner.nextInt();

        int result;

        //Suma
        result = numberA + numberB;
        System.out.println("The sum of the numbers entered is:" + result);
    }

}
