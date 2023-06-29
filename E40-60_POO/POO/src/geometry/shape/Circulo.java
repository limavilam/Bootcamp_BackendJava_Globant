package geometry.shape;

public class Circulo {

    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }
    public double getRadio (){
        return this.radio;
    }
    public void setRadio (double radio){
        this.radio = radio;
    }
    public double area(){
        return  Math.pow(radio, 2) * Math.PI;
    }
    public double perimetro(){
        return 2 * radio * Math.PI;
    }
}
