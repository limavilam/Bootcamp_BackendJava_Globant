import java.util.Scanner;

//Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
//detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
//la cantidad de números impares. Al igual que en el ejercicio anterior los números
//negativos no deben sumarse. Nota: recordar el uso de la sentencia break.

public class ExerciseExtra8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int numberData;
       int dataCounter = 0; //cantidad de números leídos
       int oddCounter = 0; //cantidad de números impares
       int pairCounter = 0; //cantidad de números pares

        while (true) {

            System.out.print("Ingrese el número:");
            numberData = scanner.nextInt();


            dataCounter ++;

            //Conteo de pares e impares
            if (numberData % 2 == 0){
                pairCounter++;
            }else {
                oddCounter++;
            }

            if (numberData % 5 == 0){
                break;
            }

        }

        System.out.println("Cantidad de números leídos: " + dataCounter);
        System.out.println("Cantidad de números pares: " + pairCounter);
        System.out.println("Cantidad de números impares: " + oddCounter);
    }
}
