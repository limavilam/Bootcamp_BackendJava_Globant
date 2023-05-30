import java.util.Scanner;

//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
//la función equals() en Java.

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a phrase:");
        String phrase = scanner.nextLine();

        if (phrase.equalsIgnoreCase("eureka") ) { //compara las cadenas sin tener en cuenta las diferencias entre mayúsculas y minúsculas
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
    }
}
