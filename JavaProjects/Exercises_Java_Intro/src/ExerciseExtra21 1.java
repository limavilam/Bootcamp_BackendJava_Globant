import java.util.Scanner;

public class ExerciseExtra21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadAlumnos = 2;
        double[] promedios = new double[cantidadAlumnos];
        int aprobados = 0;
        int desaprobados = 0;

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese la nota del primer trabajo práctico evaluativo " + (i + 1) + ":");
            double nota1 = scanner.nextDouble();
            System.out.println("Ingrese la nota del segundo trabajo práctico evaluativo " + (i + 1) + ":");
            double nota2 = scanner.nextDouble();
            System.out.println("Ingrese la nota del primer integrador " + (i + 1) + ":");
            double nota3 = scanner.nextDouble();
            System.out.println("Ingrese la nota del segundo integrador " + (i + 1) + ":");
            double nota4 = scanner.nextDouble();

            double promedio = calcularPromedio(nota1, nota2, nota3, nota4);
            promedios[i] = promedio;

            if (promedio >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }

    public static double calcularPromedio(double nota1, double nota2, double nota3, double nota4) {
        double promedio = (nota1 * 0.1 + nota2 * 0.15 + nota3 * 0.25 + nota4 * 0.5) / 4;
        return promedio;
    }
}
