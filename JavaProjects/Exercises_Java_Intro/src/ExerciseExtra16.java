import java.util.Scanner;

public class ExerciseExtra16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String respuesta = "Sí";
        while (respuesta.equalsIgnoreCase("Sí")) {
            System.out.print("Ingrese el nombre de la persona: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la edad de la persona: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el búfer de entrada

            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);

            if (edad >= 18) {
                System.out.println("Es mayor de edad.");
            } else {
                System.out.println("Es menor de edad.");
            }

            System.out.print("¿Quiere seguir mostrando personas? (Sí/No): ");
            respuesta = scanner.nextLine();
        }

        System.out.println("Fin del programa.");
        scanner.close();
    }
}
