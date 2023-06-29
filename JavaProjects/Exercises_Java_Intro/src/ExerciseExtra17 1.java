import java.util.Scanner;

//Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
//por parámetro para que nos indique si es o no un número primo, debe devolver true si es
//primo, sino false.
//Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
//primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

public class ExerciseExtra17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.print("Ingrese el número que le gustaría validar si es primo: ");
        number = scanner.nextInt();

        boolean esPrimo = esNumeroPrimo(number);
        System.out.println("¿Es primo? " + esPrimo);
    }


    public static boolean esNumeroPrimo(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            /*}else{
                return true;*/
            }
        }
        return true;
    }

}


