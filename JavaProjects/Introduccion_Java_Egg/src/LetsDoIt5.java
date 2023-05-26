import java.util.Scanner;
public class LetsDoIt5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Con esta clase guardamos valores ingresados por consola con las variables");

        //utiliza el método next de Scanner
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        //MAO5: Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
        //Scanner.

        //Boolean
        System.out.println("Enter boolean variable(True or False):");
        boolean booleanVariable = scanner.nextBoolean();

        //Double
        System.out.println("Enter double variable:");
        double doubleVariable = scanner.nextDouble();

        //Char
        System.out.println("Enter a character:");
        char charVariable = scanner.next().charAt(0);

        // Show entered values
        System.out.println("The name is:" + name + "and the age is:" + age);
        System.out.println("boolean value: " + booleanVariable);
        System.out.println("double value: " + doubleVariable);
        System.out.println("Character: " + charVariable);

    }
}
