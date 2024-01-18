package br.edu.curso.secao22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Default methods: São métodos concretos implementados em interfaces. Estes métodos, como são concretos, ou seja,
já possuem implementação, não precisa ser implementados nas classesque implementarem esta interface.


*/
public class Program67 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        Comparator<String> comparador = new ComparadorPorTamanho();

        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("PlayStation 4");
        palavras.add("OutLast 2");

        //Collections.sort(palavras); //Ordem de forma alfabética

        palavras.sort(comparador);

        System.out.println(palavras);
    }
}
