import java.util.Scanner;

//EJERCICIO EXTRA13: Crear un programa que dibuje una escalera de números, donde cada línea de números
//comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
//usuario al comenzar. Ejemplo: si se ingresa el número 3:
//1
//12
//123

public class ExerciseExtra13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera: ");
        int altura = scanner.nextInt();

        //se utiliza para imprimir los números en cada línea de la escalera.
        // La condición j <= i se utiliza para asegurar que solo se impriman los números desde 1 hasta el valor actual de i.

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
