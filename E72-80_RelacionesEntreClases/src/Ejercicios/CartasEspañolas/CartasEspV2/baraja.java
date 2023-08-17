package Ejercicios.CartasEspañolas.CartasEspV2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class baraja {
    private List<carta> cartas;

    public baraja() {
        cartas = new ArrayList<>();
        String[] palos = {"espadas", "bastos", "oros", "copas"};
        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new carta(numero, palo));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    /*public void barajar() {
        Random random = new Random();
        int n = cartas.size();
        for (int i = 0; i < n; i++) {
            int randomIndex = i + random.nextInt(n - i);
            Carta temp = cartas.get(i);
            cartas.set(i, cartas.get(randomIndex));
            cartas.set(randomIndex, temp);
        }
    }*/


    public carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
        return cartas.remove(0);
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public List<carta> darCartas(int numCartas) {
        if (numCartas > cartas.size()) {
            System.out.println("No hay suficientes cartas disponibles.");
            return null;
        }

        List<carta> cartasRepartidas = new ArrayList<>();
        for (int i = 0; i < numCartas; i++) {
            cartasRepartidas.add(cartas.remove(0));
        }
        return cartasRepartidas;
    }

    public List<carta> cartasMonton() {
        if (cartas.size() == 40) {
            System.out.println("No ha salido ninguna carta todavía.");
            return null;
        }
        return cartas;
    }

    public void mostrarBaraja() {
        for (carta carta : cartas) {
            System.out.println(carta);
        }
    }
}
