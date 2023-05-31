import java.util.Scanner;
public class LetsDoIt10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //for (int i=0; i<10; i++){
        //       System.out.println("print the value of i:"+ " " + i);
        //       }
        //       System.out.println("=============================");

    //System.out.println("For decreasing");
    //for (int i=10; i>0;i--){ //Mientras que i sea mayor que cero
    //System.out.println("Print the value of i:" + " "+ i);
    //}


        //MAO10: Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
        //ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
        //5 *****
        //3 ***
        //11 ***********
        //2 **

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter a number (from 1 to 20): ");
            int number = scanner.nextInt();

            // Verificar que el número esté dentro del rango válido
            if (number >= 1 && number<= 20) {
                System.out.print(number + " "); //imprime el numero más los asteriscos
                for (int j = 0; j < number; j++) {
                    System.out.print("*");
                }
                System.out.println(); //Le da el espacio
            } else {
                System.out.println("Invalid number. Try again.");
                i--; // Restar 1 al contador para volver a solicitar un número válido
            }
        }
    }
}
