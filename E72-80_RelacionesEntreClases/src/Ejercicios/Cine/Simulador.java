package Ejercicios.Cine;

public class Simulador {

    private int aceptados;
    private int procesados;

    public Simulador(){
        aceptados = procesados = 0;
    }

    public int getAceptados() {
        return aceptados;
    }

    public int getProcesados() {
        return procesados;
    }

    public int getRechazados() {
        return procesados-aceptados;
    }

    public void simular (Pelicula pelicula,
                         int nroEspectadores){
        this.procesados = nroEspectadores;
        Sala sala = new Sala(pelicula);
        for (int i=0; i<nroEspectadores; i++){
            Generador gen = Generador.getGenerador();
            if (sala.ubicar(Espectador.crearEspectador(), gen.sigFila(), gen.sigColumna())){
                aceptados++;
            }
        }
    }
}
