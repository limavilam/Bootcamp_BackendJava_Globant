import java.util.Scanner;

/*Una obra social tiene tres clases de socios:
        o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
        todos los tipos de tratamientos.
        o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
        los mismos tratamientos que los socios del tipo A.
        o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
        tratamientos.
        o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
        real que represente el costo del tratamiento (previo al descuento) y determine el
        importe en efectivo a pagar por dicho socio.*/
public class ExerciseExtra5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String membershipType;
        float treatmentValue;
        double discount;

        do {
            System.out.println("INGRESE EL TIPO DE SOCIO");
            System.out.println("a. Socio A");
            System.out.println("b. Socio B");
            System.out.println("c. Socio C");
            membershipType = scanner.nextLine().toLowerCase();

            System.out.println("Ingrese el valor del tratamiento:");
            treatmentValue = scanner.nextFloat();

            switch (membershipType) {
                case "a":
                    discount = treatmentValue * 0.50;
                    System.out.println("Para el socio categoria A el valor del tratamiento es: " + "" + treatmentValue + " el importe a pagar es: " + " " + discount);
                    break;
                case "b":
                    discount = treatmentValue * 0.65; //100-35
                    System.out.println("Para el socio categoria B el valor del tratamiento es: " + "" + treatmentValue + " el importe a pagar es: " + " " + discount);
                    break;
                case "c":
                    System.out.println("Para el socio categoria C el valor del tratamiento es: " + "" + treatmentValue + ", por ahora no cuenta con descuento");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (false); //si coloco true me sigue el ciclo
    }
}