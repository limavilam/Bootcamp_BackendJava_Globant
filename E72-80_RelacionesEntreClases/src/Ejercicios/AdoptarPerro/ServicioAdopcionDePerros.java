package Ejercicios.AdoptarPerro;

import java.util.*;

public class ServicioAdopcionDePerros {
    private ArrayList<Persona> listaPersonas;
    private ArrayList<Perro> perrosDisponiblesParaAdopcion;
    private HashMap<Perro, Persona> perrosAdoptados;

    private Scanner scanner = new Scanner(System.in);
    ServicioAdopcionDePerros(ArrayList<Persona> personas, ArrayList<Perro> perros){
        this.perrosDisponiblesParaAdopcion = perros;
        this.listaPersonas = personas;
        this.perrosAdoptados = new HashMap<>();
    }

    public void mostrarMenuPrincipal(){
        System.out.println("Bienvenido a perritos de corazón");
        System.out.println("------------------------------------------");
        System.out.println("1. Ver perritos disponibles para adopción");
        System.out.println("2. Ver perritos adoptados");
        System.out.println("3. Mostrar personas");
        System.out.println("4. Iniciar proceso de adopción");
        System.out.println("5. Salir");
        System.out.println("-------------------------------------------");
        System.out.println("Seleccione una opción");
    }

    public void menu(){
        int option = 0;
        while (option!=5){
            mostrarMenuPrincipal();
            option = scanner.nextInt();
            switch (option){
                case 1:
                    for(Perro perro : perrosDisponiblesParaAdopcion){
                        System.out.println(perro);
                        System.out.println();
                    }
                    break;
                case 2:
                    for(Map.Entry<Perro,Persona> entrySet: perrosAdoptados.entrySet()){
                        System.out.println(entrySet.getKey() + " adoptado por " + entrySet.getValue());
                        System.out.println();
                    }
                    break;
                case 3:
                    for(Persona persona : listaPersonas){
                        System.out.println(persona);
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Iniciando proceso de adopcion");
                    for(Persona persona : listaPersonas){
                        boolean perritoEncontrado = false;
                        System.out.println("Hola " + persona.getNombre() + " ingresa el nombre del perrito" + " que quieres adpotar");
                        String nombrePerrito = scanner.next();

                        for(int i = 0; i < perrosDisponiblesParaAdopcion.size(); i++){
                            Perro perro = perrosDisponiblesParaAdopcion.get(i);
                            if(perro.getNombre().equalsIgnoreCase(nombrePerrito)){
                                System.out.println("Felicidades vas adoptar a " + perro);
                                //Agregar perrito adoptado a lista de perritos adoptados.
                                persona.agregarPerrito(perro);
                                //Eliminar el perrito adoptado de la lista de perros disponibles
                                perrosDisponiblesParaAdopcion.remove(i);
                                //Agregar perrito adoptado a mapa de perritos adoptados
                                perrosAdoptados.put(perro, persona);
                                perritoEncontrado = true;
                            }
                            if(perritoEncontrado){
                                break;
                            }
                        }
                        if(!perritoEncontrado){
                            System.out.println("No se encotro el perrito");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo ...");
                    break;
                default:
                    System.out.println("Opcion no valida, ingrese un numero entre 1 y 5");
            }
        }
    }
}
