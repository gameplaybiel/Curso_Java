package br.edu.curso.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Lambdas
/* -> Expressões lambdas, são funções anônimas */
public class Program72 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        Comparator<String> comparador = new ComparadorPorTamanho();

        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("PlayStation 4");
        palavras.add("OutLast 2");

        palavras.sort(comparador);

        //Expressão lambda - forma 1
        /*palavras.forEach((String s) -> {
            System.out.println(s);
        });
        */

        //Expressão lambda - forma 2
        palavras.forEach((s) -> {
            System.out.println(s);
        });
    }
}