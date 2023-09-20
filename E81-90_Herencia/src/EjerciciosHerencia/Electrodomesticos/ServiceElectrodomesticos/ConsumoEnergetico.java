package EjerciciosHerencia.Electrodomesticos.ServiceElectrodomesticos;

public enum ConsumoEnergetico {
    A,
    B,
    C,
    D,
    E,
    F;

    // Método estático para comprobar si una letra es válida como nivel de consumo
    public static boolean esLetraValida(char letra) {
        for (ConsumoEnergetico nivel : ConsumoEnergetico.values()) {
            if (nivel.name().charAt(0) == letra) {
                return true;
            }
        }
        return false;
    }
}

    /*nivel.name(): name() es un método proporcionado automáticamente por todos los enums en Java.
    Devuelve el nombre del valor del enum en forma de cadena de caracteres.
    En este caso, nivel.name() obtiene el nombre del valor del enum ConsumoEnergetico que estamos evaluando
     en la iteración actual.
     charAt(0): El método charAt(0) se utiliza para obtener el carácter en la posición 0
     de una cadena de caracteres (en este caso, el nombre del valor del enum).
     Dado que queremos comparar solo la primera letra del nombre, usamos .charAt(0)
     para obtener esa primera letra.
}*/
