package ejerciciosExtra;

public class Raices {

    private double a;
    private double b;
    private double c;

    //Constructores

    public Raices (){

    }

    public Raices (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Métodos get and set

    public double getA(){
        return a;
    }

    public void setA(double a){
        this.a=a;
    }

    public double getB(){
        return b;
    }

    public void setB(double b){
        this.b=b;
    }

    public double getC(){
        return c;
    }

    public void setC(double c){
        this.c=c;
    }

    //Metodo getDiscriminante
    public double getDiscriminante(){
        return (Math.pow(getB(),2)) - (4*getA()*getC());
    }

    //Metodo tiene raices
    public boolean tieneRaices(){
        return getDiscriminante()>0;
    }

    //Metodo tiene raíz

    public boolean tieneRaiz(){
        return getDiscriminante()==0;
    }

    //Método obtener raíces
    public double obtenerRaices(){
        if(tieneRaices()){
            double x1 =(-getB()+Math.sqrt(getDiscriminante()))/(2*getA());
            double x2 =(-getB()-Math.sqrt(getDiscriminante()))/(2*getA());
            System.out.println("Las raíces son: " + x1 + " y: " + x2);
        }else{
            System.out.println("No existen raíces reales");
        }
        return 0;
    }

    public boolean obtenerRaiz(){
        if(tieneRaiz()){
            double x1 = -(getB())/(2*getA());
            System.out.println("Tiene una única raíz: " + x1);
        }else{
            System.out.println("No existe");
        }
        return tieneRaiz();
    }

    public double calcular(){
        if(tieneRaices()){
            obtenerRaices();
        }else if (tieneRaiz()) {
            obtenerRaiz();
        }else{
            System.out.println("No existen soluciones reales");
        }
        return 0;
    }

}
