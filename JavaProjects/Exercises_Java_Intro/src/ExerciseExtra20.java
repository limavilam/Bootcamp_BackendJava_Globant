public class ExerciseExtra20 {
    public ExerciseExtra20() {
    }

    public static void main(String[] args) {
        int[] vector = new int[10];

        for(int i = 0; i < 10; ++i) {
            vector[i] = (int)(Math.random() * 10.0);
        }

        imprimirVector(vector);
    }

    public static void imprimirVector(int[] vector) {
        System.out.println("Elementos del vector:");

        for(int i = 0; i < vector.length; ++i) {
            System.out.println("Elemento " + (i + 1) + ": " + vector[i]);
        }

    }
}