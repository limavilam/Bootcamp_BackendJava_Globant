package EjerciciosColecciones.Listas.EjercicioRazasPerros;

import java.util.ArrayList;
import java.util.Scanner;

public class razasPerros {

    Scanner scanner = new Scanner(System.in);
    ArrayList<String> razasPerros = new ArrayList();

    public void cargarRazas() {
        System.out.println("Bienvenido a la app de razas");
        String respuesta;
        do {
            System.out.print("Ingrese la raza del perro: ");
            String raza = scanner.nextLine();

            // Verificar que la raza de perro existe en el ArrayList.
            boolean existeRaza = false;
            for (String razaExistente : razasPerros) {
                if (razaExistente.equalsIgnoreCase(raza)) {
                    existeRaza = true;
                    break;
                }
            }

            if (existeRaza) {
                System.out.println("¡La raza ingresada ya existe en la lista!");
            } else {
                razasPerros.add(raza);
            }

            System.out.print("¿Desea agregar otra raza? (SI/NO): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("SI"));
    }
    public void mostrarRazas(){
        System.out.println("La lista de razas de perros es: ");
        for (String raza : razasPerros) {
            System.out.println(raza);
        }
    }

    public static void main(String[] args) {

        razasPerros appRazas = new razasPerros(); // Creamos una instancia de la clase

        appRazas.cargarRazas(); // Llamamos al método para cargar las razas
        appRazas.mostrarRazas(); // Llamamos al método para mostrar las razas
    }

}
