package Gimnasio.servicie;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

import Gimnasio.entity.Cliente;
import Gimnasio.entity.Rutina;

public class ServicioRutina {

    private ArrayList<Rutina> rutinas;

    public ServicioRutina(){
        this.rutinas = new ArrayList<>();
    }
    public ArrayList<Rutina> getRutinas() {
        return rutinas;
    }

    //public void setRutinas(ArrayList<Rutina> rutinas) {
    //    this.rutinas = rutinas;
    //}
    public Rutina datosRutina(UUID id) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int duration;
        String difficultyLevel;
        String description;

        System.out.println("Ingresa el nombre de la rutina: ");
        name = scanner.nextLine();
        System.out.println("Ingrese la duracion de la rutina en minutos: ");
        duration = scanner.nextInt();
        System.out.println("Ingrese el nivel de dificultad: ");
        difficultyLevel = scanner.skip("\n").nextLine();
        System.out.println("Ingrese la descripción: ");
        description= scanner.skip("\n").nextLine();

        return new Rutina (id,name,duration,difficultyLevel, description);
    }

    public void registrarRutina(){
        UUID uuid = UUID.randomUUID();
        this.rutinas.add(datosRutina(uuid));
    }

    public ArrayList<Rutina> obtenerRutinas(){
        return getRutinas();
    }
    public void actualizarRutina(Rutina rutina, int indice){
        Rutina rutinaActualizada = datosRutina(rutina.getId());
        rutinas.set(indice,rutinaActualizada);
    }

    public void eliminarRutina(UUID id) {
        boolean rutinaEncontrada = false;

        for (Rutina rutina : rutinas) {
            if (rutina.getId().equals(id)) {
                rutinas.remove(rutina);
                rutinaEncontrada = true;
                break;
            }
        }
        if (rutinaEncontrada) {
            System.out.println("Rutina eliminada correctamente.");
        } else {
            System.out.println("No se encontró una rutina con el ID especificado.");
        }
    }


}
