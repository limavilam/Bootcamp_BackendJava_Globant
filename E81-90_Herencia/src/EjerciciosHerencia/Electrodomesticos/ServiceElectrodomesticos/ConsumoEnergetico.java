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
