import java.util.Scanner;

//Ejercicio Extra14: Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
//hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
//de hijos para averiguar la media de edad de los hijos de todas las familias.

public class ExerciseExtra14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de familias: ");
        int familiesNumber = scanner.nextInt();

        float promedioEdades;

        //Tip: No puedo dejarlo todo en un solo bucle porque exigiría que el número de hijos sea el mismo para ambas familias.
        //Tip2: tampoco se deben dejar los contadores fuera o la sumatoria del promedio no se reinicia en cada ciclo, calculando mal el promedio.

        for (int i = 1; i <= familiesNumber; i++) {

            System.out.println("Ingrese la cantidad de hijos para la familia  " + i + " : ");
            int childrenNumber = scanner.nextInt();

            int contadorHijos = 0;
            int contadorEdades = 0;

            for (int j = 1; j <= childrenNumber; j++) {
                System.out.println("Ingrese la edad del hijo " + j + " de la familia " + i);
                int edades = scanner.nextInt();
                contadorHijos++;
                contadorEdades+=edades;
            }
            promedioEdades= (float) contadorEdades/contadorHijos;
            System.out.println("La media de edad de los hijos de la familia " + i +" es: " + promedioEdades);
        }

    }
}
