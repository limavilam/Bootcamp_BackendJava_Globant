import java.util.Scanner;

public class ExerciseExtra19 {
    public ExerciseExtra19() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vectorA = new int[6];
        int[] vectorB = new int[6];

        for (int i = 0; i < 6; ++i) {
            vectorA[i] = (int) (Math.random() * 10.0);
        }

        for (int i = 0; i < 6; ++i) {
            vectorB[i] = i + 1;
        }

        System.out.println("VectorA en orden descendente:");

        for (int i = 5; i >= 0; --i) {
            System.out.println(vectorA[i]);
        }

        System.out.println("VectorB en orden descendente:");

        for (int i = 5; i >= 0; --i) {
            System.out.println(vectorB[i]);
        }

        boolean sonIguales = true;

        for (int i = 0; i < 6; ++i) {
            if (vectorA[i] != vectorB[i]) {
                sonIguales = false;
                break;
            }
        }

        if (sonIguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores son diferentes.");
        }
    }
}
