package br.edu.curso.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//ForEach
public class Program69 {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();

        Consumer consumidor = new imprimeNaLinha();

        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("PlayStation 4");
        palavras.add("OutLast 2");

        palavras.forEach(consumidor); // -> para cada

    }
}
