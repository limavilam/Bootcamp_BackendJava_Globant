import java.util.Scanner;

//Crea una aplicación que a través de una función nos convierta una cantidad de euros
//introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
//función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
//una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
//(void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la moneda a la que deseas convertir (libras, dólares o yenes): ");
        String currency = scanner.next();

        System.out.println("Ingrese el valor de euros que desea convertir:");
        float euroValue = scanner.nextFloat();

        currencyConversion(currency,euroValue);
    }
    public static void currencyConversion(String currency, float euroValue) {

        double convertedAmount = 0.0;
        String message;

        switch (currency.toLowerCase()) {
                case "libras":
                    convertedAmount  = euroValue * 0.86;
                    message = euroValue + "euros equivalen a " + convertedAmount + " libras";
                    System.out.println(message);
                    break;
                case "dolares":
                    convertedAmount  = euroValue * 1.28611;
                    message = euroValue + "euros equivalen a " + convertedAmount + " dólares";
                    System.out.println(message);
                    break;
                case "yenes":
                    convertedAmount  = euroValue * 129.852;
                    message = euroValue + "euros equivalen a " + convertedAmount + " yenes";
                    System.out.println(message);
                    break;
                default:
                    message = "Moneda no valida.";
                    System.out.println(message);
            }
        }
}

