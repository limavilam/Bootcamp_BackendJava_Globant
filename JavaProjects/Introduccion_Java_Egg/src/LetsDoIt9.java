import java.util.Scanner;
public class LetsDoIt9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String answer;

        //do {
        //    System.out.println("¿Desea continuar?");
        //    answer = scanner.nextLine();
        //} while (answer.equalsIgnoreCase("S"));

    //MAO9: Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
    //    bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
    //    resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
    //    Nota: recordar el uso de la sentencia break.

        int number;
        int sum = 0;
        int counter = 0;

        do {
            System.out.println("Enter a number:");
            number = scanner.nextInt();

            if (number == 0) {
                System.out.println("The number entered is zero.");
                break;
            }
            if (number > 0) {
                sum += number;
            }

            counter++;
        } while (counter<20);

        System.out.println("the sum of the numbers is: " + sum);
    }
}


