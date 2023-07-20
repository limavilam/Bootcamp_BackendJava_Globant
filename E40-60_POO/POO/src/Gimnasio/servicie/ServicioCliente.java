package Gimnasio.servicie;

import Gimnasio.entity.Cliente;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class ServicioCliente {

    private ArrayList<Cliente> clientes;

    public ServicioCliente() {
        this.clientes = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente agregarDatosCliente(UUID id) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        double weight;
        double height;
        String goal;

        System.out.println("Ingresa el nombre completo: ");
        name = scanner.nextLine();
        System.out.println("Ingrese la edad: ");
        age = scanner.nextInt();
        System.out.println("Ingrese la altura en metros (m): ");
        height = scanner.nextDouble();
        System.out.println("Ingrese el peso en kilogramos (Kg): ");
        weight= scanner.nextDouble();
        System.out.println("Ingresa el objetivo: ");
        goal =  scanner.skip("\n").nextLine();

        return new Cliente(id, name, age, weight, height, goal);
    }

    public void registrarCliente(){
        UUID uuid = UUID.randomUUID();
        this.clientes.add(agregarDatosCliente(uuid));
    }

    public ArrayList<Cliente> obtenerClientes(){
        return getClientes();
    }

    public void actualizarCliente(Cliente cliente, int indice){
        Cliente clienteActualizado = agregarDatosCliente(cliente.getId());
        clientes.set(indice,clienteActualizado);
    }

    public void eliminarCliente(UUID id) {
        boolean clienteEncontrado = false;

        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                clientes.remove(cliente);
                clienteEncontrado = true;
                break;
            }
        }
        if (clienteEncontrado) {
            System.out.println("Cliente eliminado correctamente.");
        } else {
            System.out.println("No se encontró un cliente con el ID especificado.");
        }
    }

}
