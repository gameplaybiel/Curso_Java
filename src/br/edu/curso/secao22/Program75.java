package br.edu.curso.secao22;

/*
- Method references
- Podem ser consideradas simplificações das expressões lambdas.
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Program75 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("PlayStation 4");
        palavras.add("OutLast 2");

        //palavras.sort(Comparator.comparing(s -> s.length()));

        //Forma 1
        //palavras.sort(Comparator.comparing(String::length));

        //Forma 2
        //Function<String, Integer> tamanho = String::length; //Method Reference
        Function<String, Integer> tamanho = s -> s.length(); // Expressão lambda
        Comparator<String> comparator = Comparator.comparing(tamanho);
        palavras.sort(comparator);

       //System.out.println(palavras);

       palavras.forEach(System.out::println); //Method references
    }
}
