package ejerciciosExtra;

import java.util.Scanner;

public class AdivinarMes {
    public static void main(String[] args) {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[6];

        Scanner scanner = new Scanner(System.in);
        String intento;

        do {
            System.out.print("Introduce el nombre del mes: ");
            intento = scanner.nextLine().toLowerCase();

            if (intento.equals(mesSecreto)) {
                System.out.println("¡Yuju, adivinaste el mes secreto!");
                break;
            } else {
                System.out.println("No es el mes secreto. Intenta nuevamente.");
            }
        } while (true);
    }
}
