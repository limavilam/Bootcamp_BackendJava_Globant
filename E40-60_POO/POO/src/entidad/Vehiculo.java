package entidad;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private TipoVehiculo tipoVehiculo;
    private double distanciaRecorrida;

    //Constructor con parámetros
    public Vehiculo (String marca, String modelo, int anio, TipoVehiculo tipoVehiculo){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipoVehiculo = tipoVehiculo;
        this.distanciaRecorrida = 0;
    }
    //Constructor sin atributos.
    public Vehiculo(){
        this.distanciaRecorrida = 0;
    }
    //Métodos set y get.
    public String getMarca(){return this.marca;}
    public void setMarca(String marca){this.marca=marca;}
    public String getModelo(){return this.modelo;}
    public void setModelo(String modelo){this.modelo=modelo;}
    public int getAnio(){return this.anio;}
    public void setAnio(int anio){this.anio=anio;}
    public TipoVehiculo getTipo(){return this.tipoVehiculo;}
    public void setTipo(TipoVehiculo tipoVehiculo){this.tipoVehiculo = tipoVehiculo;}

    public double getDistanciaRecorrida(){
        return this.distanciaRecorrida;
    }
    //Métodos
    public void moverse(int segundos) {
        switch (this.tipoVehiculo) {
            case AUTOMOVIL:
                this.distanciaRecorrida += 3 * segundos;
            case MOTOCICLETA:
                this.distanciaRecorrida += 2 * segundos;
            case BICICLETA:
                this.distanciaRecorrida += segundos;
        }
    }

    //Método frenar.
    public void frenar() {
        if(this.tipoVehiculo != TipoVehiculo.BICICLETA){
            this.distanciaRecorrida += 2;
        }
    }

}
