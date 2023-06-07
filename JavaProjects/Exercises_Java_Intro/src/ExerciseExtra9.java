import java.util.Scanner;

/*Ejercicio extra9: Simular la división usando solamente restas. Dados dos números enteros mayores que
        uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
        Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
        resultado es el residuo, y el número de restas realizadas es el cociente.
        Por ejemplo: 50 / 13:
        50 – 13 = 37 una resta realizada
        37 – 13 = 24 dos restas realizadas
        24 – 13 = 11 tres restas realizadas
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
        ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/

public class ExerciseExtra9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el dividendo (número entero mayor a 1):");
        int dividendo = scanner.nextInt();

        System.out.print("Ingrese el divisor (número entero mayor a 1):");
        int divisor = scanner.nextInt();

        int cociente =0;

        do {
            if (dividendo >= divisor){
                dividendo = dividendo - divisor; //también lo puedo escribir así: dividendo -= divisor (-= operador de asignación y resta);
                cociente++;
            }else{  //Si no coloco esto el bucle es infinito.
                break;
            }
        }while(true);
        int residuo = dividendo;
        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + residuo);

    }
}
