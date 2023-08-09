package EjerciciosColecciones.Conjuntos.EjercicioPaises.principal;

import EjerciciosColecciones.Conjuntos.EjercicioPaises.servicio.ServicioPaises;

import java.util.HashSet;
import java.util.Scanner;

public class mainPaises {

    public static void main(String[] args){
        /*HashSet<String> nombresPaises = new HashSet<>();

        nombresPaises.add("Colombia");
        nombresPaises.add("Colombia");
        nombresPaises.add("Colombia");

        for (String nombres:nombresPaises){
            System.out.println(nombres);
        }
*/
        ServicioPaises countrySetService = new ServicioPaises ();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        do {
            System.out.print("Ingrese un país: ");
            String country = scanner.nextLine();
            countrySetService.adicionarPaises(country);

            System.out.print("¿Desea agregar otro país? (s/n): ");
            String choice = scanner.nextLine();
            if (choice.toUpperCase().equalsIgnoreCase("n")) {
                exit = true;
            }
        } while (!exit);

        System.out.println("Países guardados en el conjunto:");
        countrySetService.mostrarPaises();

        countrySetService.organizarPaisesAlfabeticamente();

        System.out.print("Ingrese el país que desea eliminar del conjunto: ");
        String countryToDelete = scanner.nextLine();
        if (countrySetService.removerPaises(countryToDelete)) {
            System.out.println("El país fue eliminado satisfactoriamente. Conjunto actualizado es:");
            countrySetService.mostrarPaises();
        } else {
            System.out.println("El país no se encuentra en el conjunto.");
        }
    }

}
