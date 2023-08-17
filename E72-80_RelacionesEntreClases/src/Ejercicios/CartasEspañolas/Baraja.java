package Ejercicios.CartasEspañolas;

public class Baraja {

    private Carta cartas[];
    private int posSiguienteCarta; //Decirnos que carta es la siguiente

    public static final int num_cartas = 40; //puedo hacer un enum


    public Baraja(){
        this.cartas=new Carta[num_cartas];
        this.posSiguienteCarta=0;
    }

    public void crearBaraja(){

        String [] palos = Carta.palos;

        for(int i=0; i< palos.length;i++){

            for(int j=0;j<Carta.limite_carta_palo; j++){
                if (!(j==7 || j==8)){  //Inicia en cero, posicion 8 y 9.
                    if (j>=9){
                        cartas[(i*(Carta.limite_carta_palo-2)+j-2)]= new Carta(j+1,palos[i]);

                    }else{
                        cartas[(i*(Carta.limite_carta_palo-2)+j)]= new Carta(j+1,palos[i]);
                    }

                }

            }

        }

    }

    public void barajar() {

        int posAleatoria = 0;
        Carta c;

        //Recorro las cartas
        for (int i = 0; i < cartas.length; i++) {

            posAleatoria = (int)(Math.random());

            //intercambio
            c = cartas[i];
            cartas[i] = cartas[posAleatoria];
            cartas[posAleatoria] = c;

        }

        //La posición vuelve al inicio
        this.posSiguienteCarta = 0;

    }

    /**
     * Devuelve la casta donde se encuentre "posSiguienteCarta"
     * @return carta del arreglo
     */
    public Carta siguienteCarta() {

        Carta c = null;

        if (posSiguienteCarta == num_cartas) {
            System.out.println("Ya no hay mas cartas, barajea de nuevo");
        } else {
            c = cartas[posSiguienteCarta++];
        }

        return c;

    }

    /**
     * Devuelve un numero de cartas. Controla si hay mas cartas de las que se piden
     * @param numCartas
     * @return
     */
    public Carta[] darCartas(int numCartas) {

        if (numCartas > num_cartas) {
            System.out.println("No se puede dar mas cartas de las que hay");
        } else if (cartasDisponible() < numCartas) {
            System.out.println("No hay suficientes cartas que mostrar");
        } else {

            Carta[] cartasDar = new Carta[numCartas];

            //recorro el array que acabo de crear para rellenarlo
            for (int i = 0; i < cartasDar.length; i++) {
                cartasDar[i] = siguienteCarta(); //uso el metodo anterior
            }

            //Lo devuelvo
            return cartasDar;

        }

        //solo en caso de error
        return null;

    }

    /**
     * Indica el numero de cartas que hay disponibles
     * @return
     */
    public int cartasDisponible() {
        return num_cartas - posSiguienteCarta;
    }

    /**
     * Muestro las cartas que ya han salido
     */
    public void cartasMonton() {

        if (cartasDisponible() == num_cartas) {
            System.out.println("No se ha sacado ninguna carta");
        } else {
            //Recorro desde 0 a la posSiguienteCarta
            for (int i = 0; i < posSiguienteCarta; i++) {
                System.out.println(cartas[i]);
            }
        }

    }

    /**
     * Muestro las cartas que aun no han salido
     */
    public void mostrarBaraja() {

        if (cartasDisponible() == 0) {
            System.out.println("No hay cartas que mostrar");
        } else {
            for (int i = posSiguienteCarta; i < cartas.length; i++) {
                System.out.println(cartas[i]);
            }
        }

    }

}