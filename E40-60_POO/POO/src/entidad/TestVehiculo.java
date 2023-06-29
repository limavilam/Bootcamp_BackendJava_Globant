package entidad;

import java.util.Scanner;

public class TestVehiculo {

    public static Vehiculo crearVehiculo() {
        Vehiculo vehiculo = new Vehiculo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creando nuevo vehiculo");
        System.out.print("Ingrese la marca: ");
        vehiculo.setMarca(scanner.next());
        System.out.print("Ingrese el modelo: ");
        vehiculo.setModelo(scanner.next());
        System.out.print("Ingrese el año: ");
        vehiculo.setAnio(scanner.nextInt());
        System.out.print("Ingrese el tipo (automóvil, motocicleta o bicicleta): ");
        vehiculo.setTipo(TipoVehiculo.valueOf(scanner.next().toUpperCase()));
        return vehiculo;
    }

    public static void imprimirDistanciaRecorrida(Vehiculo vehiculo){
        System.out.println("La distancia recorrida por el vehiculo de tipo " + vehiculo.getTipo() + " es: "
                + vehiculo.getDistanciaRecorrida() + " metros");

    }
    public static void main(String[] args) {
        Vehiculo vehiculo1 = crearVehiculo();
        Vehiculo vehiculo2 = crearVehiculo();
        Vehiculo vehiculo3 = crearVehiculo();

        vehiculo1.moverse(350);
        vehiculo2.moverse(350);
        vehiculo3.moverse(350);
        vehiculo1.frenar();
        vehiculo2.frenar();
        vehiculo3.frenar();

        imprimirDistanciaRecorrida(vehiculo1);
        imprimirDistanciaRecorrida(vehiculo2);
        imprimirDistanciaRecorrida(vehiculo3);
    }
}

