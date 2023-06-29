package clasesUtilidad;

import java.time.Instant;
import java.util.Scanner;
import java.util.Date;

public class Date1 {

    public Date1() {
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dia;
        int mes;
        int anio;

        System.out.println("Ingrese el día: ");
        dia = scanner.nextInt();

        System.out.println("Ingrese el mes: ");
        mes = scanner.nextInt();

        System.out.println("Ingrese el año: ");
        anio = scanner.nextInt();
        System.out.println(anio-1900);

        Date fechaIngresada = new Date(anio-1900,mes-1,dia);
        Date fechaActual = new Date();

        // Mostrar la fecha ingresada
        System.out.println("Fecha ingresada: " + fechaIngresada);

        // Mostrar la fecha actual
        System.out.println("Fecha actual: " + fechaActual);

        //Mostrar si las fechas están antes o después.
        System.out.println(fechaActual.after(fechaIngresada));
        System.out.println(fechaActual.before(fechaIngresada));

        //Diferencia de las fechas.
        long diferencia = fechaActual.getTime() -fechaIngresada.getTime();
        long res = (diferencia/(3600000));
        System.out.println("La diferencia de fechas es: " + res);

    }
}
