import java.util.Scanner;

//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
//restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
//matemática y deben devolver sus resultados para imprimirlos en el main.

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
            //Los resultados de estas operaciones se almacenan en variables específicas como resultadoMultiplicacion o resultadoSuma.
                case 1:
                    double resultadoSuma = sumar(numberA,numberB);
                    System.out.println("La suma es: " + resultadoSuma);
                    break;
                case 2:
                    double resultadoResta = restar(numberA,numberB);
                    System.out.println("La suma es: " + resultadoResta);
                    break;
                case 3:
                    double resultadoMultiplicacion = multiplicar(numberA,numberB);
                    System.out.println("La suma es: " + resultadoMultiplicacion);
                    break;
                case 4:
                    double resultadoDivision = dividir(numberA,numberB);
                    System.out.println("La suma es: " + resultadoDivision);
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        }

        // Las funciones van fuera del método main pero dentro de la clase.

    public static double sumar(double numA, double numB){
        double suma= numA + numB;
        return (int) suma;
    }
    public static double restar(double numA, double numB){
        double resta = numA - numB;
        return (int) resta;
    }

    public static double multiplicar(double numA, double numB){
        double multiplicacion = numA * numB;
        return (int) multiplicacion;
    }

    public static double dividir(double numA, double numB){
        double division = numA / numB;
        return (int) division;
    }
}
