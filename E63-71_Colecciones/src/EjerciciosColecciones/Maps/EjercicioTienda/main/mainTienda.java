package EjerciciosColecciones.Maps.EjercicioTienda.main;

import EjerciciosColecciones.Maps.EjercicioTienda.servicio.ServicioTienda;

import java.util.Scanner;

public class mainTienda {

    public static void main(String[] args) {

        ServicioTienda tiendaService = new ServicioTienda();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n--Bienvenido al menú de la Tienda Patikalvitos --");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio de un producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            System.out.print("Por favor seleccione la opción de interés: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombreProducto = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precioProducto = scanner.nextDouble();
                    tiendaService.agregarProducto(nombreProducto, precioProducto);
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del producto a modificar: ");
                    String productoModificar = scanner.nextLine();
                    System.out.print("Ingrese el nuevo precio del producto: ");
                    double nuevoPrecio = scanner.nextDouble();
                    tiendaService.modificarPrecioProducto(productoModificar, nuevoPrecio);
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String productoEliminar = scanner.nextLine();
                    tiendaService.eliminarProducto(productoEliminar);
                    break;

                case 4:
                    tiendaService.mostrarProductos();
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

