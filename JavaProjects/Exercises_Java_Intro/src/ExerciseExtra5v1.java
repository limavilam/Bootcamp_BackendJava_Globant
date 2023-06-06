import java.util.Scanner;

public class ExerciseExtra5v1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la clase de socio (A, B, C): ");
        char claseSocio = scanner.nextLine().charAt(0);

        System.out.print("Ingrese el costo del tratamiento: ");
        double costoTratamiento = scanner.nextDouble();

        double importePagar = calcularImportePagar(claseSocio, costoTratamiento);

        System.out.println("El importe en efectivo a pagar es: $" + importePagar);
    }

    public static double calcularImportePagar(char claseSocio, double costoTratamiento) {
        double importePagar = costoTratamiento;

        if (claseSocio == 'A') {
            importePagar *= 0.5; // 50% de descuento para los socios tipo A
        } else if (claseSocio == 'B') {
            importePagar *= 0.65; // 35% de descuento para los socios tipo B
        }

        return importePagar;
    }
}
