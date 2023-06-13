import java.util.Scanner;

public class ExerciseExtra18 {
    public ExerciseExtra18() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        int[] vector = new int[100];
        int countVector = 0;

        for(int i = 0; i < 100; ++i) {
            vector[i] = i + 1;
            countVector += vector[i];
        }

        System.out.println("La suma del vector es: " + countVector);
    }
}

