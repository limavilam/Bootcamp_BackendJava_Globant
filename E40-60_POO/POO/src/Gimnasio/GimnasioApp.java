package Gimnasio;

import Gimnasio.entity.Cliente;
import Gimnasio.entity.Rutina;
import Gimnasio.servicie.ServicioCliente;
import Gimnasio.servicie.ServicioRutina;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;


public class GimnasioApp {

    static ServicioCliente servicioCliente = new ServicioCliente();
    static ServicioRutina servicioRutina = new ServicioRutina();

    public static void imprimirMenu() {

        Scanner scanner = new Scanner(System.in);
        int id = 0;
        int longitud = servicioCliente.getClientes().size();

        while (true) {
            System.out.println("Bienvenido al Gimnasio Patikalvos ");
            System.out.println("\nSelecciona la opción que desees:");
            System.out.println("1. Crear un cliente");
            System.out.println("2. Ver clientes ");
            System.out.println("3. Actualizar un cliente ");
            System.out.println("4. Eliminar un cliente ");
            System.out.println("5. Crear una rutina");
            System.out.println("6. Ver rutinas ");
            System.out.println("7. Actualizar una rutina ");
            System.out.println("8. Eliminar una rutina ");
            System.out.println("0. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            if (opcion == 0) {
                System.out.println("¡Hasta luego Patikalvitos!");
                break;
            }

            switch (opcion) {
                case 1:
                    servicioCliente.registrarCliente();
                    break;
                case 2:
                    imprimirClientesSiExisten(servicioCliente.obtenerClientes());
                    break;
                case 3:
                    System.out.println("Ingrese el ID del cliente a actualizar:");
                    String input = scanner.nextLine();
                    UUID idCliente = UUID.fromString(input);
                    for (int i = 0; i < servicioCliente.getClientes().size(); i++) {
                        Cliente cliente = servicioCliente.getClientes().get(i);
                        if (cliente.getId().equals(idCliente)) {
                            servicioCliente.actualizarCliente(cliente, i);
                            System.out.println("Cliente actualizado: id " + cliente.getId() + " en el indice " + i);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el ID del cliente a eliminar:");
                    String idClienteEliminar = scanner.nextLine();
                    //   scanner.nextLine();
                    servicioCliente.eliminarCliente(UUID.fromString(idClienteEliminar));
                    break;
                case 5:
                    servicioRutina.registrarRutina();
                    break;
                case 6:
                    imprimirRutinasSiExisten(servicioRutina.obtenerRutinas());
                    break;
                case 7:
                    System.out.println("Ingrese el ID de la rutina que desea actualizar:");
                    String inputRutina = scanner.nextLine();
                    UUID idRutina = UUID.fromString(inputRutina);
                    for (int i = 0; i < servicioRutina.getRutinas().size(); i++) {
                        Rutina rutina = servicioRutina.getRutinas().get(i);
                        if (rutina.getId().equals(idRutina)) {
                            servicioRutina.actualizarRutina(rutina, i);
                            System.out.println("La rutina actualizada: id " + rutina.getId() + " en el indice " + i);
                        }
                    }
                    break;
                case 8:
                    System.out.println("Ingrese el ID de la rutina que desea eliminar:");
                    String idRutinaEliminar = scanner.nextLine();
                    //   scanner.nextLine();
                    servicioRutina.eliminarRutina(UUID.fromString(idRutinaEliminar));
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    private static void imprimirClientesSiExisten(List<Cliente> clientes) {
        if (clientes.isEmpty())
            System.out.println("No se encontraron clientes");
        else
            for (int index = 0; index < clientes.size(); index++)
                System.out.println(index + 1 + ". " + clientes.get(index));
    }

    private static void imprimirRutinasSiExisten(List<Rutina> rutinas) {
        if (rutinas.isEmpty())
            System.out.println("No se encontraron rutinas");
        else
            for (int index = 0; index < rutinas.size(); index++)
                System.out.println(index + 1 + ". " + rutinas.get(index));
    }

    public static void main(String[] args) {
        imprimirMenu();
    }
}
