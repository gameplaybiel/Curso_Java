package br.edu.curso.secao19;

import br.edu.curso.secao11.Cliente;

import java.util.ArrayList;
import java.util.Collections;

public class Program48 {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        Cliente c1 = new Cliente(24,"Angelina Jolie", "Rua da Paz, 345");
        Cliente c2 = new Cliente(32,"Felcity Jones", "Avenida Paulista, 455");
        Cliente c3 = new Cliente(20,"José Alves", "Avenida Alexandre Marion, 35");

        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);

        Collections.sort(clientes);

        for(Cliente cliente: clientes){
            System.out.println(cliente);
        }
    }
}
