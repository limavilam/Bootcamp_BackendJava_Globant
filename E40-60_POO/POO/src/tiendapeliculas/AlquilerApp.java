package tiendapeliculas;

import tiendapeliculas.entity.Alquiler;
import tiendapeliculas.entity.Pelicula;
import tiendapeliculas.service.ServicioAlquiler;
import tiendapeliculas.service.ServicioPelicula;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AlquilerApp {

    private static ServicioPelicula servicioPelicula = new ServicioPelicula();
    private static ServicioAlquiler servicioAlquiler = new ServicioAlquiler();

    public static void imprimirMenu(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Bienvenido a Alquiler de Películas PatikalvosApp ");
            System.out.println("\nSelecciona la opción que desees:");
            System.out.println("1. Crear una película nueva");
            System.out.println("2. Crear alquiler de película ");
            System.out.println("3. Mostrar las películas disponibles ");
            System.out.println("4. Mostrar películas alquiladas ");
            System.out.println("5. Buscar película por título ");
            System.out.println("6. Buscar película por género ");
            System.out.println("7. Buscar película alquilada por fecha ");
            System.out.println("8. Calcular el ingreso total del servicio ");
            System.out.println("0. Salir");
            int opcion = scanner.nextInt();
            if (opcion == 0) {
                System.out.println("¡Hasta luego Patikalvitos!");
                break;
            }

            switch (opcion) {
                case 1:
                    servicioPelicula.crearPelicula();
                    break;
                case 2:
                    System.out.println("Ingrese el titulo de la película que desea alquilar:");
                    String titulo = scanner.skip("\n").nextLine();
                    List<Pelicula> peliculas =servicioPelicula.peliculasDisponiblePorTitulo(titulo);
                    if(peliculas.isEmpty()){
                        System.out.println("No se encontro ninguna pelicula por el titulo ingresado \n" +
                                "Para validar las peliculas disponibles use la opcion 3 del menu");
                    }else if(peliculas.size() == 1){
                        imprimirPeliculasSiExisten(peliculas);
                        System.out.println("Desea alquilar la pelicula? (S/N)");
                        String opcionAlquiler = scanner.nextLine();
                        // El metodo equalsIgnoreCase valida si dos Strings son iguales sin importar si esta en mayusculas
                        // o minusculas
                        if (opcionAlquiler.equalsIgnoreCase("S")) {
                            servicioAlquiler.crearAlquiler(peliculas.get(0));
                        } else {
                            System.out.println("Regresando al menu principal");
                        }
                    }else{
                        System.out.println("Se encontraron varios resultados para esta busqueda:");
                        imprimirPeliculasSiExisten(peliculas);
                        System.out.println("Ingrese el numero de la pelicula que desea alquilar o 0 para regresar al menu");
                        int opcionPeliculaParaAlquilar = scanner.nextInt();
                        if(opcionPeliculaParaAlquilar!=0 && opcionPeliculaParaAlquilar<= peliculas.size())
                            servicioAlquiler.crearAlquiler(peliculas.get(opcionPeliculaParaAlquilar-1));
                    }

                    break;
                case 3:
                    imprimirPeliculasSiExisten(servicioPelicula.peliculasDisponibles());
                    break;
                case 4:
                    imprimirAlquilerSiExisten(servicioAlquiler.getPeliculasAlquiladas());
                    break;
                case 5:
                    System.out.println("Ingrese el título de la película que desea buscar: ");
                    String tituloParaBuscar = scanner.skip("\n").nextLine();
                    imprimirPeliculasSiExisten(servicioPelicula.peliculasDisponiblePorTitulo(tituloParaBuscar));
                    break;
                case 6:
                    System.out.println("Ingrese el genero de la película que desea buscar: ");
                    String generoParaBuscar = scanner.skip("\n").nextLine();
                    imprimirPeliculasSiExisten(servicioPelicula.peliculasDisponiblePorGenero(generoParaBuscar));
                    break;
                case 7:
                    Date fechaDeEntrega =  servicioAlquiler.solicitarFechasAlquiler(" de entrega");
                    imprimirAlquilerSiExisten(servicioAlquiler.buscarPorFecha(fechaDeEntrega));
                    break;
                case 8:
                    System.out.println("El ingreso total por los alquileres es: " + servicioAlquiler.calcularTotalPrecio());
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }}
    }

    private static void imprimirPeliculasSiExisten(List<Pelicula> peliculas){
        if(peliculas.isEmpty())
            System.out.println("No se encontraron peliculas");
        else
            for(int index = 0; index < peliculas.size(); index++)
                System.out.println(index+1 + ". " + peliculas.get(index));
    }

    private static void imprimirAlquilerSiExisten(List<Alquiler> alquileres){
        if(alquileres.isEmpty())
            System.out.println("No se encontraron alquileres");
        else
            for(int index = 0; index < alquileres.size(); index++)
                System.out.println(index+1 + ". " + alquileres.get(index));
    }
    public static void main(String[] args) {
        imprimirMenu();
    }
}
