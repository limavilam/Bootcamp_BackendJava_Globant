import java.util.Scanner;

//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter degrees Celsius you want to convert to Fahrenheit:");
        float degreesCelsius = scanner.nextFloat();

        float result;

        //Conversion
        result = 32 + (9 * degreesCelsius / 5);
        System.out.println("The sum of the numbers entered is:" + result);
    }
}
