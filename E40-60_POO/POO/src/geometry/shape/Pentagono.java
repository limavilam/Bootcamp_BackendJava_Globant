package geometry.shape;

public class Pentagono {
    private double lado;
    private double apotema;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public Pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public double area(){
        return (5*lado*apotema)/2;
    }

    public double perimetro(){
        return (5*lado);
    }
}
