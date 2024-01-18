package br.edu.curso.secao18;

import java.util.Locale;

/*
Trabalhando com Strings

-> Strings em Java são imutáveis, ou seja, não muda nada.
*/
public class Program42 {
    public static void main(String[] args) {
        String curso = "Programação em Java do básico ao avançado";

        System.out.println(curso);

        /*String novo_curso = curso.replace("Java", "Ptyhon");//Altera na string se encontrar, a primeira palavra pela segunda.
          System.out.println(novo_curso);
          curso = curso.toLowerCase();//Converte pela letras maíusculas para minúsculas
          curso = curso.toUpperCase();

         */

        curso = curso.replace("Java", "Python");//Altera na string se encontrar, a primeira palavra pela segunda.

        System.out.println(curso);

        /*for(int i = 0; i < curso.length(); i++){
            System.out.println(curso.charAt(i));
        }*/

        /*
        for(int i = (curso.length() - 1); i >= 0; i--){
            System.out.println(curso.charAt(i));
        }
        */
    }
}
