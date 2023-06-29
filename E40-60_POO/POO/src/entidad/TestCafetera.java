package entidad;

import java.util.Scanner;

public class TestCafetera {
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera(100, 100);
        System.out.println("Servir cafe de 20");
        cafetera.servirTaza(20);
        System.out.println("La capacidad actual de la cafetera es " + cafetera.getCantidadActual());

        System.out.println("Servir cafe de 50");
        cafetera.servirTaza(50);
        System.out.println("La capacidad actual de la cafetera es " + cafetera.getCantidadActual());

        System.out.println("Servir cafe de 50");
        cafetera.servirTaza(50);
        System.out.println("La capacidad actual de la cafetera es " + cafetera.getCantidadActual());
    }
}