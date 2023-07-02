package clasesUtilidad;

import java.util.Date;
import java.util.Scanner;

public class Persona {
    String nombre;
    Date fechaDeNacimiento;

    public Persona() {

    }

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    // Getters y setters.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    // Método para crear persona.
    public static Persona crearPersona() {
        Scanner scanner = new Scanner(System.in);
        // Persona persona = new Persona();
        String nombre;
        int dia;
        int mes;
        int anio;
        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese el día: ");
        dia = scanner.nextInt();

        System.out.println("Ingrese el mes: ");
        mes = scanner.nextInt();

        System.out.println("Ingrese el año: ");
        anio = scanner.nextInt();

        return new Persona(nombre, new Date(anio -1900, mes -1, dia));
    }

    public long calcularEdad() {
        Date fechaActual = new Date();

        long diferencia = fechaActual.getTime() - this.fechaDeNacimiento.getTime();
        long res = (diferencia / (3600000))/8760;
      /*  System.out.println("La diferencia de fechas es: " + res);
        System.out.println("Fecha de nacimiento: "+ this.fechaDeNacimiento);
        System.out.println("La fecha actual es: " + fechaActual);*/
        return res;
    }

    public boolean menorQue(int edad) {
        return calcularEdad() - edad < 0;
    }

    public void  mostrarPersona(){
        System.out.println("Nombre: " + this.nombre + " fecha de nacimiento: " + this.fechaDeNacimiento +
                " edad: " +  calcularEdad());
    }
    public static void main(String[] args) {
        Persona persona = crearPersona();
        persona.calcularEdad();
        persona.mostrarPersona();
        System.out.println("Es menor de 30? " + persona.menorQue(30));
    }
}
