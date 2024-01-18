package br.edu.curso.secao22;

import java.util.Comparator;

/*
A gente está criando nosso próprio comparador de objetos (Strings)
para que seja possível, desta forma, ordenar a string pelo seu tamanho
ao invés de ordem alfabética.

1- A string1 é menor que string2 -> retornamos -1
2- A string2 é maior que string1 -> retornamos 1
3- A string1 têm o mesmo tamanho da string2 -> retornamos 0

*/
public class ComparadorPorTamanho implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        // 1- A string1 é menor que string2 -> retornamos -1
        if(s1.length() < s2.length()){
            return -1;
        }
        // 2- A string2 é maior que string1 -> retornamos 1
        if(s1.length() > s2.length()){
            return 1;
        }
        //3- A string1 têm o mesmo tamanho da string2 -> retornamos 0
        return 0;
    }
}
