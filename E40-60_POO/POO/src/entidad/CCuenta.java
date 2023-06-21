package entidad;

public class CCuenta{

    //Atributos
    private String nombre; //Privado accesible solo por los métodos de su propia clase.
    private String cuenta;
    private double saldo;
    private double tipoDeInteres;

   /* creando un constructor: cuando es vacío, será invocado cada vez que
    se construya un objeto sin especificar ningún argumento */

    public CCuenta(){} //constructor vacio
    public CCuenta(String nom, String cue, double sal, double tipo){ //constructor pasado con parámetros
        asignarNombre(nom);
        asignarCuenta(cue);
        ingreso(sal);
        aignarTipoDeInteres(tipo);
    }

    //Tendrá que acceder al código mediante los métodos.

    //Los paréntesis indican a Java que el identificador se refiere a un método y no a un atributo
    public void asignarNombre(String nom){
        if (nom.length()==0){
            System.out.println("Error: cadena vacia");
            return;
        }
        nombre = nom;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public void asignarCuenta(String cue){
        if (cue.length()==0){
            System.out.println("Error: cuenta no vacia");
            return;
        }
        cuenta = cue;
    }
    public String obtenerCuenta(){
        return cuenta;
    }
    public double estado(){
        return saldo;
    }
    public void ingreso(double cantidad){
        if (cantidad < 0){
            System.out.println("Error: cantidad negativa");
            return;
        }
        saldo = saldo + cantidad;
    }
    public void reintegro(double cantidad){
        if (saldo - cantidad < 0){
            System.out.println("Error: no dispone de saldo");
            return;
        }
        saldo = saldo - cantidad;
    }
    public void aignarTipoDeInteres(double tipo){
        if (tipo < 0){
            System.out.println("Error: tipo no valido");
            return;
        }
        tipoDeInteres = tipo;
    }
    public double obtenerTipoDeInteres(){
        return tipoDeInteres;
    }
}
