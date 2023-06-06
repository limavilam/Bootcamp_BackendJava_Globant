import java.util.Scanner;

//Ejercicio extra 6: Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
//debajo de 1.60 mts. y el promedio de estaturas en general.
public class ExerciseExtra6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas a promediar:");
        int numberPeople = scanner.nextInt();

        double addHeights = 0;
        int contadorEstaturasBajas= 0;
        double total160 = 0;


        for (int i = 1; i <= numberPeople; i++) {
            System.out.print("Ingrese la estatura de la persona " + i + " (en metros): ");
            double heights = scanner.nextDouble();

            addHeights = addHeights + heights;

            if (heights < 1.60) {
                total160 = total160 + heights;
                contadorEstaturasBajas++; //contadorEstaturasBajas = contadorEstaturasBajas + 1
                System.out.print(contadorEstaturasBajas);
            }
        }

        double promedioEstaturasBajas = 0;
        double averageHeights = 0;

        if (contadorEstaturasBajas > 0) {
            promedioEstaturasBajas = total160 / contadorEstaturasBajas;
        }

        averageHeights= addHeights / numberPeople;

        System.out.println("El promedio de estaturas por debajo de 1.60 metros es: " + promedioEstaturasBajas + " metros");
        System.out.println("El promedio de estaturas en general es: " + averageHeights + " metros");
    }
}
