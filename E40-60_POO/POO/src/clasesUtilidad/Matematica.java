package clasesUtilidad;

public class Matematica {

    private double numeroA;
    private double numeroB;

    //Constructores
    public Matematica (){

    }
    public Matematica (double numeroA, double numeroB){
        this.numeroA= numeroA;
        this.numeroB = numeroB;
    }

    //Métodos get y set

    public double getNumeroA() {
        return numeroA;
    }

    public void setNumeroA(double numeroA) {
        this.numeroA = numeroA;
    }

    public double getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(double numeroB) {
        this.numeroB = numeroB;
    }
}
