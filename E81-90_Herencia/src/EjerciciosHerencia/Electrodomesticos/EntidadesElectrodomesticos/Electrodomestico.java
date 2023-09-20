package EjerciciosHerencia.Electrodomesticos.EntidadesElectrodomesticos;

import EjerciciosHerencia.Electrodomesticos.ServiceElectrodomesticos.Colores;
import EjerciciosHerencia.Electrodomesticos.ServiceElectrodomesticos.ConsumoEnergetico;

import java.util.Scanner;

public class Electrodomestico {
    private double precio;
    private Colores color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio,Colores color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra) {
        if (ConsumoEnergetico.esLetraValida(letra)) {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = 'F'; // Consumo por defecto si no es válido
        }
    }

    //El método values() es proporcionado automáticamente por el compilador para todos
    // los enums en Java. Enumera todos los valores del enum y los devuelve en un arreglo,
    // lo que facilita la iteración a través de ellos.
    //Returns an array containing the constants of this enum type, in the order they're declared. This method may be used to iterate over the constants as follows:
    //        for(Colores c : Colores.values())
    //        System.out.println(c);
    //Returns:
    //an array containing the constants of this enum type, in the order they're declared
    public static boolean esColorValido(String color) {
        String colorElectrodomestico = color.toLowerCase();
        for (Colores col : Colores.values()) {
            if (col.name().toLowerCase().equals(colorElectrodomestico )) {
                return true;
            }
        }
        return false;
    }

    public void crearElectrodomestico() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio del electrodoméstico: ");
        double precioUsuario = scanner.nextDouble();
        setPrecio(precioUsuario);

        System.out.println("Ingrese el color del electrodoméstico: ");
        String colorUsuario = scanner.next();
        if (Colores.esColorValido(colorUsuario)) {
            setColor(colorUsuario.toLowerCase());
        } else {
            setColor("blanco"); // Color por defecto si no es válido
        }

        System.out.println("Ingrese el consumo energético (A, B, C, D, E o F): ");
        char consumoUsuario = scanner.next().charAt(0);
        comprobarConsumoEnergetico(consumoUsuario);

        // Cerrar el scanner después de su uso
        scanner.close();
    }


}
