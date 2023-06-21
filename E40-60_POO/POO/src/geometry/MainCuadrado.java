package geometry;

import geometry.shape.Circunferencia;
import geometry.shape.Cuadrado;
public class MainCuadrado {
    public static void main(String[] args){
        Cuadrado cuadrado1 = new Cuadrado(5);

        System.out.println("El aréa del cuadrado cuando es : " + cuadrado1.area());
        System.out.println("El perimétro del cuadrado es : " + cuadrado1.perimetro());

        //No creo un nuevo objeto, solo lo estoy dando un nuevo valor

        cuadrado1.setLado(2);

        System.out.println(cuadrado1.area());
        System.out.println(cuadrado1.perimetro());
        System.out.println(cuadrado1.getLado());

    }
}
