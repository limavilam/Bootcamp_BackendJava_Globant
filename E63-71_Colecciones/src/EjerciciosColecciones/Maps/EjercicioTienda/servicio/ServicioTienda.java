package EjerciciosColecciones.Maps.EjercicioTienda.servicio;

import java.util.HashMap;
import java.util.Map;

public class ServicioTienda {

    //HashMap<nombreProducto,precioProducto> productosTienda = new HashMap()
    HashMap<String,Double> productosTienda = new HashMap();

    public ServicioTienda() {
        this.productosTienda = productosTienda;
    }

    public void agregarProducto(String nombreProducto, double precio) {
        productosTienda.put(nombreProducto, precio);
    }

    public void modificarPrecioProducto(String nombreProducto, double nuevoPrecio) {
        if (productosTienda.containsKey(nombreProducto)) { //Revisar el método replace video extra (https://www.youtube.com/watch?v=slTCa-WUU7k)
            productosTienda.put(nombreProducto, nuevoPrecio);
            System.out.println("Precio de " + nombreProducto + " ha sido modificado exitosamente.");
        } else {
            System.out.println("El producto no existe en la tienda de patikalvitos.");
        }
    }

    public void eliminarProducto(String nombreProducto) {  //No olvidar que los mapas son los únicos que no podemos eliminar mientras iteramos.
        if (productosTienda.containsKey(nombreProducto)) {
            productosTienda.remove(nombreProducto);
            System.out.println(nombreProducto + " ha sido eliminado de la tienda.");
        } else {
            System.out.println("El producto no existe en la tienda de patikalvitos.");
        }
    }

    //Otra manera de mostrarlo
    //https://www.delftstack.com/es/howto/java/how-to-print-hashmap-in-java/#imprime-los-elementos-de-hashmap-usando-el-m%c3%a9todo-keyset-en-java

    /*public void mostrarProductos() {
        System.out.println("Lista de productos:");
        for (Map.Entry<String, Double> entry : productosTienda.entrySet()) {
            String nombreProducto = entry.getKey();
            double precio = entry.getValue();
            System.out.println(nombreProducto + " - Precio: " + precio);
        }
    }*/

    public void mostrarProductos() {
        for (String nombreProducto : productosTienda.keySet()) {
            Double precio = productosTienda.get(nombreProducto);
            System.out.println("clave:" + nombreProducto + " valor: " + precio);
        }
    }




}
