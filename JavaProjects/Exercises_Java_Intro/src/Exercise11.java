import java.util.Scanner;

//EJERCICIO11: Realizar un programa que pida dos números enteros positivos por teclado y muestre por
//pantalla el siguiente un menú.

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menuNumber;
        int numA = 0, numB = 0;
        float result;
        String confirmation;

        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija opción: ");
            menuNumber = scanner.nextInt();

            if (menuNumber >= 1 && menuNumber<= 4) {
                System.out.print("Ingrese el primer número: ");
                numA = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                numB = scanner.nextInt();
            }

            switch (menuNumber) {
                case 1:
                    result = numA + numB;
                    System.out.println("La suma de los números es: " + result);
                    break;
                case 2:
                    result = numA - numB;
                    System.out.println("La resta de los números es: " + result);
                    break;
                case 3:
                    result = numA * numB;
                    System.out.println("La multiplicación de los números es: " + result);
                    break;
                case 4:
                    if (numB != 0) {
                        result = numA / numB;
                        System.out.println("La división de los números es:" + result);
                    } else {
                        System.out.println("No se puede dividir entre cero");
                    }
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa? S/N");
                    confirmation = scanner.skip("\n").nextLine(); //Usado para que no incluya el enter al momento de colocar la entrada.
                    if (confirmation.equalsIgnoreCase("S")) {
                        System.out.println("Saliendo del programa");
                        return;
                    } else
                        break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
            //break; si coloco este break me sale del menú de opciones
        } while (true);
    }
}
