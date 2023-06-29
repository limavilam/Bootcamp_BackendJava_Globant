package entidad;

import java.util.*;

public class TestPersona {

    //Metodo crear persona.
    public static Persona crearPersona(){
        Persona persona1 = new Persona();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creando nueva persona");
        System.out.print("Ingrese el nombre: ");
        persona1.setNombre(scanner.next());
        System.out.print("Ingrese la edad: ");
        persona1.setEdad(scanner.nextInt());
        System.out.print("Ingrese el género: ");
        try{
            persona1.setSexo(Genero.valueOf(scanner.next().toUpperCase()));
        } catch (IllegalArgumentException exception){
            System.out.println("El genero no es valido");
        }
        System.out.print("Ingrese el peso: ");
        persona1.setPeso(scanner.nextDouble());
        System.out.print("Ingrese la altura: ");
        persona1.setAltura(scanner.nextDouble());
        return persona1;
    }

    public static double calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (imc < 20) {
            return -1; // Por debajo del peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0; // Peso ideal
        } else {
            return 1; // Sobrepeso
        }
    }
    public static boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public static void imprimirIMC(Persona persona, double imc){
        System.out.println("IMC de " + persona.getNombre() + " imc:  " + imc);
    }

    public static void main(String[] args) {
        Persona persona1 = crearPersona();
        Persona persona2 = crearPersona();
        Persona persona3 = crearPersona();
        Persona persona4 = crearPersona();

        double imcP1 = calcularIMC(persona1);
        double imcP2 = calcularIMC(persona2);
        double imcP3 = calcularIMC(persona3);
        double imcP4 = calcularIMC(persona4);

        boolean p1EsMayordeEdad = esMayorDeEdad(persona1);
        boolean p2EsMayordeEdad = esMayorDeEdad(persona2);
        boolean p3EsMayordeEdad = esMayorDeEdad(persona3);
        boolean p4EsMayordeEdad = esMayorDeEdad(persona4);

        imprimirIMC(persona1 ,imcP1);
        imprimirIMC(persona2 ,imcP2);
        imprimirIMC(persona3 ,imcP3);
        imprimirIMC(persona4 ,imcP4);

        List<Double> personas =  Arrays.asList(imcP1, imcP2, imcP3, imcP4);
        double porPersonasPorDebajoIMC = (personas.stream().filter(imc -> imc == -1).count())/personas.size();
        double porPersonasPesoIdeal = (personas.stream().filter(imc -> imc == 0).count())/personas.size();
        long porPersonasSobrePeso = (personas.stream().filter(imc -> imc == 1).count())/personas.size();

        System.out.println("% bajo peso " + porPersonasPorDebajoIMC);
        System.out.println("% peso ideal " + porPersonasPesoIdeal);
        System.out.println("% sobre peso " + porPersonasSobrePeso);
    }
}
