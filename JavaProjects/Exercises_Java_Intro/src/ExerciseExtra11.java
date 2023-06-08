import java.util.Scanner;

//Ejercicio extra 11: Escribir un programa que lea un número entero y devuelva el número de dígitos que
//componen ese número. Por ejemplo, si introducimos el número 12345, el programa
//deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
//de división. Nota: recordar que las variables de tipo entero truncan los números o
//resultados.
public class ExerciseExtra11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        int contador = 0;

        // Verificar si el número es negativo y convertirlo a positivo
        if (numero < 0) {
            numero = -numero;
        }

        // Contar los dígitos mediante la división sucesiva
        do {
            numero =numero/ 10;
            contador++;
        } while (numero != 0);

        System.out.println("El número tiene " + contador + " dígitos.");
    }
}


