import java.util.Scanner;

//EXTRA1:Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
//usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

public class ExerciseExtra1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un tiempo en minutos: ");
        int minutesLogged = scanner.nextInt();

        float hours,days,hoursA,daysA;

        //conversion horas
        hours = minutesLogged/60;
        //conversion segundos
        days = hours/24;
        hours=hours % 24;

        System.out.println("La cantidad de minutos ingresados equivalen a: " + " " + days + " días y " + " " + hours + " horas");

    }
}
