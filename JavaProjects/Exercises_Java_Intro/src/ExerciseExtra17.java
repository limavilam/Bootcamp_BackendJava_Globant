import java.util.Scanner;

public class ExerciseExtra17 {
    public ExerciseExtra17() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número que desea validar si es primo: ");
        int number = scanner.nextInt();
        boolean esPrimo = esNumeroPrimo(number);
        System.out.println("¿Es primo? " + esPrimo);
    }

    public static boolean esNumeroPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
