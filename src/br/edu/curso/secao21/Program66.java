package br.edu.curso.secao21;

//Implementação do conjunto

import java.util.HashSet;
import java.util.Set;

public class Program66 {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<String>();

        System.out.println(nomes);

        nomes.add("Angelina");
        nomes.add("Ana");
        nomes.add("Gabriela");

        System.out.println(nomes);

        String n1 = "Angelina";
        String n2 = "Ana";
        String n3 = "Gabriela";

        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());
        System.out.println(n3.hashCode());
    }
}
