import java.util.Scanner;

//EXERCISE extra 4: Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
//equivalente en romano.

public class ExercisesExtra4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.println("CONVERSOR DE NÚMEROS ROMANOS");
            System.out.println("");
            System.out.println("Ingrese un número de 1 a 10:");
            number = scanner.nextInt();

            switch (number){
                case 1:
                    System.out.println("El número en romano es: " + "I");
                    break;
                case 2:
                    System.out.println("El número en romano es: " + "II");
                    break;
                case 3:
                    System.out.println("El número en romano es: " + "III");
                    break;
                case 4:
                    System.out.println("El número en romano es: " + "IV");
                    break;
                case 5:
                    System.out.println("El número en romano es: " + "V");
                    break;
                case 6:
                    System.out.println("El número en romano es: " + "VI");
                    break;
                case 7:
                    System.out.println("El número en romano es: " + "VII");
                    break;
                case 8:
                    System.out.println("El número en romano es: " + "VIII");
                    break;
                case 9:
                    System.out.println("El número en romano es: " + "IX");
                    break;
                case 10:
                    System.out.println("El número en romano es: " + "X");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (true); //si coloco true me sigue el ciclo
            }
}

