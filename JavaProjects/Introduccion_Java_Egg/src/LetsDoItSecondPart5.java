import java.util.Scanner;

public class LetsDoItSecondPart5 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        //System.out.println("Con esta clase guardamos valores ingresados por consola con las variables");

        //Exercises book

        //System.out.println("Cadena de caracteres:");
        //String str = scanner.next();
        //System.out.println("Valor entero:");
        //int dato = scanner.nextInt();
        //scanner.close();

        // Show entered values

        //System.out.println("la cadena de caracteres es:" + str);
        //System.out.println("el valor entero es: " + dato);

        //Lee un String y un init del objeto datosDeEntrada. Observe que como separador de los datos se utiliza la coma.

        String datosDeEntrada = "abc, 123";
        Scanner scanner = new Scanner(datosDeEntrada);
        scanner.useDelimiter("\\s*,\\s*"); //método useDelimiter de Scanner de la clase Pattern
        String str = scanner.next();
        int dato = scanner.nextInt();

    }
}
