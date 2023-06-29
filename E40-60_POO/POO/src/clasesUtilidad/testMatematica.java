package clasesUtilidad;

import java.util.Random;

public class testMatematica {

    public static String devolverMayor(Matematica numero){
        double numeroA = numero.getNumeroA();
        double numeroB = numero.getNumeroB();
        if (numeroA > numeroB) {
            return "El número mayor es A: " + numeroA;
        } else {
            return "El número mayor es B: " + numeroB;
        }
    }
    //Otra manera de hacerlo.
   /*public static double devolverMayorA(Matematica numeroPrueba) {
        double numeroA = numeroPrueba.getNumeroA();
        double numeroB = numeroPrueba.getNumeroB();
        return Math.max(numeroA, numeroB);
    }*/

    public static String calcularPotencia(Matematica numero) {
        double numeroA = Math.round(numero.getNumeroA()*10d)/10d; // 0.618 a 0.6
        double numeroB = Math.round(numero.getNumeroB()*10d)/10d;
        if (numeroA > numeroB) {
            return "La potencia del mayor valor de la clase en este caso A, elevado al menor: " + Math.pow(numeroA, numeroB);
        } else {
            return "La potencia del mayor valor de la clase en este caso B, elevado al menor: " + Math.pow(numeroB, numeroA);
        }
    }

    public static String calcularRaiz(Matematica numero) {
        double numeroA = Math.abs(numero.getNumeroA());
        double numeroB = Math.abs(numero.getNumeroB());
        if (numeroA < numeroB) {
            return "La raíz cuadrada del menor número que es A es: " + Math.sqrt(numeroA);
        } else {
            return "La raíz cuadrada del menor número que es B es: " + Math.sqrt(numeroB);
        }
    }


    public static void main(String[] args) {
        Random random = new Random();
        Matematica numero = new Matematica();
        double numeroA = random.nextDouble();
        double numeroB = random.nextDouble();

        System.out.println("El número A generado aleatoriamente: " + numeroA);
        numero.setNumeroA(numeroA);

        System.out.println("El número B generado aleatoriamente: " + numeroB);
        numero.setNumeroB(numeroB);

        System.out.println(devolverMayor(numero));
        // devolverMayor(numero); si lo dejo así no funciona porque no sale el sout en el método principal.
        System.out.println(calcularPotencia(numero));
        System.out.println(calcularRaiz(numero));
    }
}
