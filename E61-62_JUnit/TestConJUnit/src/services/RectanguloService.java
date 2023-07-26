package services;

import entities.Rectangulo;

public class RectanguloService {

    public double calcularArea(Rectangulo r){
        return r.getAncho() * r.getLargo();
    }

}
