import java.util.Scanner;

//EJERCICIO10: Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un valor límite positivo: ");
        int limitNumber = scanner.nextInt();

        int suma = 0;
        int contador = 0;

        while (suma <= limitNumber) {
            System.out.print("Ingresa un número: ");
            int number = scanner.nextInt();
            suma += number;
            contador++;
        }
        System.out.println("La suma de los números introducidos superó el límite inicial.");
        System.out.println("Cantidad de números ingresados: " + contador);
        System.out.println("Suma total: " + suma);
    }
}
