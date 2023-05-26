import java.util.Scanner;
public class LetsDoIt6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

              //ExampleEGG

        //int num1 = 8;
        //int num2 =7;

        //if (num1 < num2) {
            //System.out.println("La variable num1 aloja a un número menor a la variable num2");
        //} else {
            //System.out.println("La variable num1 aloja un número mayor a la variable num2");
        //}

        //MAO6: Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
        //alguno de ellos es mayor a 25.

        //utiliza el método next de Scanner
        System.out.println("Enter a number A:");
        int numberA = scanner.nextInt();

        System.out.println("Enter a number B:");
        int numberB = scanner.nextInt();

        if (numberA > 25 || numberB > 25) {
            System.out.println("Al menos uno de los dos números es mayor a 25");
        }else if (numberA >25 && numberB >25) {
            System.out.println("Ambos números son mayores a 25");
        }else {
            System.out.println("Ninguno de los dos números es mayor a 25");

        }
    }
}
