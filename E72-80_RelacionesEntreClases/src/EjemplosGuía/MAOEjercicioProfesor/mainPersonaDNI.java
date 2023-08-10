package EjemplosGuía.MAOEjercicioProfesor;

public class mainPersonaDNI {
    public static void main(String[] args) {
        Dni dni1 = new Dni('A', 12345678);
        Dni dni2 = new Dni('B', 98765432);

        Persona persona1 = new Persona("Juan", "Pérez", dni1);
        Persona persona2 = new Persona("María", "González", dni2);

        System.out.println("Persona 1:");
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Apellido: " + persona1.apellido);
        System.out.println("DNI: " + persona1.dni.serie + persona1.dni.numero);

        System.out.println("\nPersona 2:");
        System.out.println("Nombre: " + persona2.nombre);
        System.out.println("Apellido: " + persona2.apellido);
        System.out.println("DNI: " + persona2.dni.serie + persona2.dni.numero);
    }
}
