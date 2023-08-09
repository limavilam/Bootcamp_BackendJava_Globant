package EjerciciosColecciones.Listas.EjercicioNumeros;

import EjerciciosColecciones.Listas.EjercicioRazasPerros.razasPerros;

import java.util.ArrayList;
import java.util.Scanner;

public class Numeros {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> listaDeNumeros = new ArrayList();

    public void cargarNumeros() {
        System.out.println("Bienvenido");

        String respuesta;
        do {
            System.out.print("Ingrese valores numéricos enteros (para finalizar el programa ingrese -99):");
            int numeroIngresado = scanner.nextInt();

            if (numeroIngresado != -99) {
                listaDeNumeros.add(numeroIngresado);
            }

            // Verificar que hay números en el arrayList.
            boolean numerosDisponibles = !listaDeNumeros.isEmpty();

            System.out.print("¿Desea agregar otra numero? (SI/NO): ");
            scanner.nextLine();
            respuesta = scanner.nextLine().toUpperCase();

        } while (!respuesta.equalsIgnoreCase("NO"));
    }

    public void mostrarListaNumeros() {
        System.out.println("La lista de número es: ");
        for (int numeros : listaDeNumeros) {
            System.out.println(numeros);
        }
    }

    public void operacionesDeNumeros() {
        if (!listaDeNumeros.isEmpty()) {
            int suma = 0;
            for (int num : listaDeNumeros) {
                suma += num;
            }

            int cantidadValores = listaDeNumeros.size();
            double media = (double) suma / cantidadValores;

            System.out.println("Número de valores leídos: " + cantidadValores);
            System.out.println("Suma de los valores: " + suma);
            System.out.println("Media de los valores: " + media);
        } else {
            System.out.println("No se ingresaron valores.");
        }
    }


    public static void main(String[] args) {

        Numeros numeritos = new Numeros(); // Creamos una instancia de la clase

        numeritos.cargarNumeros();
        numeritos.mostrarListaNumeros();
        numeritos.operacionesDeNumeros();
    }
}

