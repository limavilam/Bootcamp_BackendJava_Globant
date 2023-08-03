package EjerciciosColecciones.Conjuntos.EjercicioPaises.servicio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ServicioPaises {

    HashSet<String> nombresPaises = new HashSet<>();

    public ServicioPaises() {
        this.nombresPaises = nombresPaises;
    }

    public void adicionarPaises(String country) {
        nombresPaises.add(country);
    }

    public void mostrarPaises() {
        for (String nombres:nombresPaises) {
            System.out.println(nombres);
        }
    }

    public void organizarPaisesAlfabeticamente(){
        Set<String> organizacionPaises = new TreeSet<>(nombresPaises);
        System.out.println("El conjunto de paises ordenado alfabéticamente:");
        for (String nombres: organizacionPaises) {
            System.out.println(nombres);
        }
    }

    public boolean removerPaises(String country) {
        Iterator<String> iterator = nombresPaises.iterator();
        while (iterator.hasNext()) {
            String paisActual = iterator.next();
            if (paisActual.equalsIgnoreCase(country)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }


}
