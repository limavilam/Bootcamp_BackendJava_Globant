import java.util.Scanner;

public class ExerciseExtra15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberA;
        double numberB;

        System.out.print("Ingrese el valor del número A: ");
        numberA = scanner.nextDouble();

        System.out.print("Ingrese el valor del número B: ");
        numberB = scanner.nextDouble();

        System.out.println("INGRESE LA OPERACIÓN MATEMÁTICA QUE DESEA REALIZAR");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int mathOperation = scanner.nextInt();

        switch (mathOperation) {
            case 1:
                double resultadoSuma = sumar(numberA, numberB);
                System.out.println("La suma es: " + resultadoSuma);
                break;
            case 2:
                double resultadoResta = restar(numberA, numberB);
                System.out.println("La resta es: " + resultadoResta);
                break;
            case 3:
                double resultadoMultiplicacion = multiplicar(numberA, numberB);
                System.out.println("La multiplicación es: " + resultadoMultiplicacion);
                break;
            case 4:
                if (numberB != 0) {
                    double resultadoDivision = dividir(numberA, numberB);
                    System.out.println("La división es: " + resultadoDivision);
                } else {
                    System.out.println("Error: no se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Opción inválida");
        }

        scanner.close();
    }

    public static double sumar(double numA, double numB) {
        return numA + numB;
    }

    public static double restar(double numA, double numB) {
        return numA - numB;
    }

    public static double multiplicar(double numA, double numB) {
        return numA * numB;
    }

    public static double dividir(double numA, double numB) {
        return numA / numB;
    }
}
