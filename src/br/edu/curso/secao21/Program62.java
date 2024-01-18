package br.edu.curso.secao21;

import java.util.Stack;

/*
-> Pilhas - Implementação do Java
*/
public class Program62 {
    public static void main(String[] args) {
        Stack<String> nomes = new Stack<String>();

        System.out.println(nomes);
        nomes.push("Angrlina"); //Insere
        nomes.push("Felicity");
        System.out.println(nomes);

        String ret = nomes.peek(); //Retorna o elemento do topo
        System.out.println(ret);
        System.out.println(nomes);

        String r1 = nomes.pop(); //Remove
        System.out.println(r1);
        System.out.println(nomes);
    }
}
