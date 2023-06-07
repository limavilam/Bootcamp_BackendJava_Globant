import java.util.Scanner;

//Ejercicio Extra10: Realice un programa para que el usuario adivine el resultado de una multiplicación entre
//dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
//si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
//al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
//utilizar la función Math.random() de Java.

public class ExerciseExtra10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el resultado de la multiplicación:");
        int multiplicationAnswer = scanner.nextInt();

        boolean multiAnswerBoolean = true;
        double result;

        while(multiAnswerBoolean){

            double numberA = (int) (Math.random()*10);
            double numberB = (int) (Math.random()*10);
            result = numberA * numberB;

            if (result == multiplicationAnswer){
                System.out.println("Correcto");
                multiAnswerBoolean = false; //Esto se hace con el propósito de terminar el bucle while y salir del ciclo.
            } else {
                System.out.println("Incorrecto, intente nuevamente");
                System.out.println("El número primer número random es: " + numberA );
                System.out.println("El número primer número random es: " + numberB );
                System.out.print("Ingrese el resultado de la multiplicación: ");
                multiplicationAnswer = scanner.nextInt();
            }
        }
    }
}
