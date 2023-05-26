import java.util.Scanner;
public class LetsDoIt8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String answer = "S";

        //while (answer.equalsIgnoreCase("S")) {
        //    System.out.println("Desea continuar?");
        //    answer = scanner.nextLine();
        //}

        //MAO8: Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
        //pedirá de nuevo hasta que la nota sea correcta.

        int note;
        boolean validNote = false; //Si dejo esto como true y quito el ! de la condición el bucle no tiene fin.

        while (!validNote) {     //!operador lógico de negación, si esto no está no se ejecuta el código, esto indica que es verdadero
            System.out.print("Enter the grade (between 0 and 10):");
            note = scanner.nextInt();

            if (note >= 0 && note <= 10) {
                validNote = true;
            } else {
                System.out.println("The note entered is invalid. Try again.");
            }
        }
    }
}