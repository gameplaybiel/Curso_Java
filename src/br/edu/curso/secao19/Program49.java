package br.edu.curso.secao19;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Collections
Conjuntos -> Os conjuntos são implementados com a interface Set, e uma das classes que implementam essa
             interface é a HashSet

A maioria das coleções possuem os mesmos métodos já conhecidos e utilizados com as listas, mas o comportamento desses
objetos é um pouco diferente.

A performance também é melhor em conjuntos do que listas.

Características dos conjuntos:
-> Não aceita a repetição de valores
-> A ordem de realização não é respeitada (Realiza uma semi-orientação)
-> Não aceita ordenação
-> Não possui índice
*/
public class Program49 {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        boolean res;

        /*
        nomes.add("Maria"); // 0
        nomes.add("José"); // 1
        nomes.add("Felicity"); // 2
        nomes.add("Gabriel"); // 3

        */
        //Collections.sort(nomes);
        //System.out.println(nomes.size());

        //System.out.println(nomes.add("Pedro"));
        // System.out.println(nomes.contains("Felicity"));

        /*
        for(Object nome : nomes){
            System.out.println(nome);
        }
        */

        for(int i = 0; i < 5; i++){
            System.out.println("Informe o " + (i + 1) + " /5 nome:");
            String nome = sc.nextLine();
            res = nomes.add(nome);
            if(!res){
                System.out.println("O nome não pode ser repetido e tente novamente.");
                i--;
            }
        }
        System.out.println("No conjunto dos nomes, nós temos " + nomes.size() + " elementos");

        for(String nome : nomes){
            System.out.println(nome);
        }
        sc.close();
    }
}
