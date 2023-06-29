import java.util.Scanner;

public class Exercises11A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int numero1, numero2;

        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                numero1 = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                numero2 = scanner.nextInt();
            }

            switch (opcion) {
                case 1:
                    int suma = numero1 + numero2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    int resta = numero1 - numero2;
                    System.out.println("La resta es: " + resta);
                    break;
                case 3:
                    int multiplicacion = numero1 * numero2;
                    System.out.println("La multiplicación es: " + multiplicacion);
                    break;
                case 4:
                    if (numero2 != 0) {
                        double division = (double) numero1 / numero2;
                        System.out.println("La división es: " + division);
                    } else {
                        System.out.println("No se puede dividir entre cero.");
                    }
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    String confirmacion = scanner.next();
                    if (confirmacion.equalsIgnoreCase("S")) {
                        System.out.println("Saliendo del programa...");
                        return;
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (true);
    }
}