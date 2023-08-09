package EjerciciosColecciones.Maps.EjercicioCantantes.main;

import EjerciciosColecciones.Maps.EjercicioCantantes.entity.FamousSinger;

import java.util.*;

public class MainFamousSinger {
    private static List<FamousSinger> famousSingers = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    private static HashMap<String, String> getDefaultSingers(){
        HashMap<String, String> defaultSingers = new LinkedHashMap<>();
        defaultSingers.put("Rufus", "Chaka Khan");
        defaultSingers.put("Shakira", "Dónde Están los Ladrones");
        defaultSingers.put("Jay-Z", "Reasonable Doubt");
        defaultSingers.put("James Brown", "Live at the Apollo");
        defaultSingers.put("Stevie Wonder", "Talking Book");
        return defaultSingers;
    }

    private static void initializeFamousSingerList(){
        for(Map.Entry<String, String> pair: getDefaultSingers ().entrySet()){
            famousSingers.add(new FamousSinger(pair.getKey(), pair.getValue()));
        }
    }

    private static void printFamousSingerList(){
        System.out.println("Lista de cantantes:");
        for (FamousSinger singer: famousSingers) {
            System.out.println(singer);
        }
    }

    private static void displayMenuOption(){
        System.out.println("Por favor seleccione una opcion");
        System.out.println("1. Agregar un cantante");
        System.out.println("2. Mostrar cantantes");
        System.out.println("3. Eliminar cantante");
        System.out.println("4. Salir");
    }

    private static void addSinger(){
        String name;
        String album;
        System.out.println("Ingrese el nombre del cantante");
        name = scanner.skip("\n").nextLine();
        System.out.println("Ingrese el album más vendido");
        album = scanner.nextLine();
        famousSingers.add(new FamousSinger(name, album));
    }

    private static boolean removeSigner(){
        String name;
        boolean singerFound = false;
        System.out.println("Ingrese el nombre del cantante");
        name = scanner.skip("\n").nextLine();
        for(FamousSinger singer: famousSingers){
            if(singer.getName().equalsIgnoreCase(name)){
                famousSingers.remove(singer);
                singerFound = true;
            }
        }
        return singerFound;
    }
    private static void application(){
        int opcion = 0;
        while (opcion!=4) {
            displayMenuOption();
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    addSinger();
                    System.out.println("Agregando Cantante");
                    break;
                case 2:
                    printFamousSingerList();
                    break;
                case 3:
                    if(removeSigner()){
                        System.out.println("Eliminando cantante");
                    }else{
                        System.out.println("Cantante no encontrado");
                    }
                    break;
                case 4:
                    printFamousSingerList();
                    System.out.println("Saliendo ...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        initializeFamousSingerList();
        printFamousSingerList();
        application();
    }
}
