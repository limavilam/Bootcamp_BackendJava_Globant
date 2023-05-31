import java.util.Scanner;

//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
//cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//* * * *
//*     *
//*     *
//* * * *
public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de elementos del lado: ");
        int limitNumber = scanner.nextInt();

        for (int i = 0; i < limitNumber; i++) {
            for (int j = 0; j < limitNumber; j++) {
                if (j == 0 || j == limitNumber-1 || i == 0 || i == limitNumber-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(); //Me da el espacio de los cuadrados.
        }
    }
}
