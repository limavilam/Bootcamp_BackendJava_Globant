import java.util.Scanner;

public class ExerciseExtra4v1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entre 1 y 10: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 11) {
            String numeroRomano = obtenerNumeroRomano(numero);
            System.out.println("El número " + numero + " en romano es: " + numeroRomano);
        } else {
            System.out.println("El número ingresado está fuera del rango válido.");
        }
    }

    //Lo que hace acá es guardar los valores a ingresar y que por defecto sale. Ejemplo si coloco 11
    //me sale XII

    public static String obtenerNumeroRomano(int numero) {
        String[] romanos = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X","XII"};
        return romanos[numero - 1];
    }
}

