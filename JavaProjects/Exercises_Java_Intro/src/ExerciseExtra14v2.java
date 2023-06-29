import java.util.Scanner;

public class ExerciseExtra14v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de familias: ");
        int cantidadFamilias = scanner.nextInt();

        int totalHijos = 0;
        int totalEdades = 0;

        for (int i = 1; i <= cantidadFamilias; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            int cantidadHijos = scanner.nextInt();

            for (int j = 1; j <= cantidadHijos; j++) {
                System.out.print("Ingrese la edad del hijo " + j + " de la familia " + i + ": ");
                int edadHijo = scanner.nextInt();

                totalHijos++;
                totalEdades += edadHijo;
            }
        }

        double mediaEdad = (double) totalEdades / totalHijos;

        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);

        scanner.close();
    }
}

