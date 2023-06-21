package geometry.shape;

public class Cuadrado {

    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }
    public double getLado (){
        return this.lado;
    }
    public void setLado (double lado){
        this.lado = lado;
    }
    public double area(){
        return  Math.pow(lado, 2);
    }
    public double perimetro(){
        return 4 * lado;
    }
}
