import java.util.Scanner;

//Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        float number = scanner.nextFloat();

        float result;

        //double number
        result = number * 2;
        System.out.println("The double of number " + number + " is " + result);
        //triple number
        result = number * 3;
        System.out.println("The triple of number " + number + " is " + result);
        //square root
        result = (float) Math.sqrt(number);
        System.out.println("The square root of number " + number + " is " + result);
    }
}
