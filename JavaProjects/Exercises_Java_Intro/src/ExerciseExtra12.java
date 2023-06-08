//Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
//0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
//Ejemplo:
//0-0-0
//0-0-1
//0-0-2
//0-0-E
//0-0-4
//0-1-2
//0-1-E
//Nota: investigar función equals() y como convertir números a String.

public class ExerciseExtra12 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    String digito1 = String.valueOf(i);
                    String digito2 = String.valueOf(j);
                    String digito3 = String.valueOf(k);

                    if (i == 3) {
                        digito1 = "E";
                    }
                    if (j == 3) {
                        digito2 = "E";
                    }
                    if (k == 3) {
                        digito3 = "E";
                    }


                    System.out.print(digito1 + "-" + digito2 + "-" + digito3);
                    System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
}


