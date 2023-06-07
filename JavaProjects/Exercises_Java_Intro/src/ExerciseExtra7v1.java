import java.util.Scanner;

//EJERCICIO EXTRA7: Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
//de n números (n>0). El valor de n se solicitará al principio del programa y los números
//serán introducidos por el usuario. Realice dos versiones del programa, una usando el
//bucle “while” y otra con el bucle “do - while”.

public class ExerciseExtra7v1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números:");
        int numberData = scanner.nextInt();

        int counter = 0;
        int number;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        /*Al asignarle el valor de Integer.MIN_VALUE, se asegura que cualquier número ingresado por
        el usuario en el bucle posterior será mayor que este valor, lo que permite encontrar el máximo correctamente.*/
        int min = Integer.MAX_VALUE;

        do {
            System.out.print("Ingrese el número mayor a cero:");
            number = scanner.nextInt();

            sum += number;

            if (number > max){
                max = number;
            }

            if (number < min){
                min = number;
            }
            counter++;
        } while (counter < numberData);

        double average = sum/numberData;

        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
        System.out.println("El promedio es: " + average);

    }
}
