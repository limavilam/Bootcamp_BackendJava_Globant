import java.util.Scanner;
public class LetsDoIt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int opcion;

    //System.out.println("Ingrese una opción:");
    //opcion = scanner.nextInt();

    //switch (opcion){
        // case 1:
        //    System.out.println("Esta línea de código se ejecuta si opcion =1");
        //    break;
        //case 2:
        //    System.out.println("Esta línea de código se ejecuta si opcion=2");
        //    break;
        //default:
        //    System.out.println("El valor ingresado en la variable opcion es diferente" + "a todos los casos analizados por switch");

    //MAO7: Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
        // que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y
        //permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:

        int optionMotorType;

        System.out.println("Enter a value from 1 y 4");
        optionMotorType = scanner.nextInt();

        switch(optionMotorType){
            case 1:
                System.out.println("The pump is a water pump");
                break; //Si no existiera el break continua con el proceso.
            case 2:
                System.out.println("The pump is a gasoline pump");
                break;
            case 3:
                System.out.println("The pump is a concrete pump");
                break;
            case 4:
                System.out.println("The bomb is a pasta bomb");
                break;
            default:
                System.out.println("There is no valid value for pump type");
        }

        }
    }
