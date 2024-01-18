package br.edu.curso.secao21;

import java.util.LinkedList;
import java.util.List;

//LinkedList
public class Program59 {
    public static void main(String[] args) {
        List<String> lista = new LinkedList<String>();

        System.out.println(lista.size());

        lista.add("Felicity");
        lista.add("José");
        lista.add("Angelina");

        lista.add(0, "Lucas");

        System.out.println(lista);
    }
}
