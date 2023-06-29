package geometry;

import geometry.shape.Circulo;

public class Main {

    public static void main(String[] args){
        Circulo circulo1 = new Circulo(20);

        System.out.println("El aréa del circulo cuando su radio es : " + circulo1.area());
        System.out.println("El perimétro del circulo cuando su radio es : " + circulo1.perimetro());
        System.out.println("El radio del circulo es:" + circulo1.getRadio());

        //No creo un nuevo objeto, solo lo estoy dando un nuevo valor

        circulo1.setRadio(50);

        System.out.println(circulo1.area());
        System.out.println(circulo1.perimetro());
        System.out.println(circulo1.getRadio());

    }
}
