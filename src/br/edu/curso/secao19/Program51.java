package br.edu.curso.secao19;

import java.util.*;

/*
Collections
Mapas -> Os mapas são representados em Java pela interface Map e mapeia seus elementos utilizando o conceito
         de chave/valor

         Os mapas são conhecidos como se fossem/representassem 3 coleções:
         -> Coleção de chaves
         -> Coleção de valores
         -> Coleção de associados
*/
public class Program51 {
    public static void main(String[] args) {
        Map<Integer, String> pessoas = new HashMap<Integer, String>();

        pessoas.put(21, "Angelina Jolie");
        pessoas.put(31, "Felicity Jones");
        pessoas.put(41, "Maria Antonia");

        //Coleção de chaves
        System.out.println("Chaves: " + pessoas.keySet());

        //Coleção de valores
        System.out.println("Valores: " + pessoas.values());

        //Coleção de associados
        System.out.println("Associados: " + pessoas.entrySet());

        //Iterar a coleção de chaves

        //Disponibilizado a partir do Java 8
        System.out.println("Forma 1");
       pessoas.keySet().forEach(idade -> {
         System.out.println(pessoas.get(idade));
        });
        System.out.println("\n");

        System.out.println("Forma 2");
        Set<Integer> chaves  = pessoas.keySet();
        for(Integer idade : chaves){
            System.out.println(pessoas.get(idade));
        }
        System.out.println("\n");

        //Iterar a coleção de valores
        System.out.println("Forma 2");
        Collection<String> valores = pessoas.values();
        for(String nome : valores){
            System.out.println(nome);
        }
        System.out.println("\n");

        System.out.println("Forma 2");
        pessoas.values().forEach(nome -> {
            System.out.println(nome);
        });
        System.out.println("\n");

        //Iterar a coleção de associados
        System.out.println("Forma 1");
        Set<Map.Entry<Integer, String>> associacoes = pessoas.entrySet();
        for(Map.Entry<Integer, String> associacao : associacoes){
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
        System.out.println("\n");

        System.out.println("Forma 2");
        pessoas.entrySet().forEach(associacao -> {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        });
    }
}
