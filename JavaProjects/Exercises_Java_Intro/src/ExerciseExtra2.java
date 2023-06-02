import java.util.Scanner;

//Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
//una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
//tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
//iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.

public class ExerciseExtra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de A: ");
        int A = scanner.nextInt();
        System.out.print("Ingrese el valor de B: ");
        int B = scanner.nextInt();
        System.out.print("Ingrese el valor de C: ");
        int C = scanner.nextInt();
        System.out.print("Ingrese el valor de D: ");
        int D = scanner.nextInt();

        int auxiliaryVariable = A;

        B = C;
        C = auxiliaryVariable;
        A = D;
        D = B;

        System.out.println("\nValores finales:"); // el n da salto de línea.
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);

    }
}
