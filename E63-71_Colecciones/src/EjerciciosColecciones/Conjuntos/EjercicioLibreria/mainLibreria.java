package EjerciciosColecciones.Conjuntos.EjercicioLibreria;

import EjerciciosColecciones.Conjuntos.EjercicioLibreria.Service.ServicioLibro;

import java.util.Scanner;

public class mainLibreria {
    public static void main(String[] args) {

        ServicioLibro servicioLibro = new ServicioLibro();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n--Bienvenido a la biblioteca Patikalvitos --");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar libros existentes");
            System.out.println("3. Préstamo de libros");
            System.out.println("4. Retornar libros"); // ¡Agrega la funcionalidad aquí!
            System.out.println("5. Salir");
            System.out.print("Por favor seleccione la opción de interés: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    servicioLibro.agregarLibro();
                    break;

                case 2:
                    servicioLibro.mostrarLibros();
                    break;

                case 3:
                    servicioLibro.prestamo();
                    break;

                case 4:
                    servicioLibro.devolucion();
                    break;

                case 5:
                    System.out.println("Gracias por consultar la tienda Patikalvitos.");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
                    break;
            }

        } while (opcion != 5);

        scanner.close();
    }
}
