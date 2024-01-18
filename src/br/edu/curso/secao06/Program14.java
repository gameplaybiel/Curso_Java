package br.edu.curso.secao06;

//Tipos de Dados - Tipos Alfanuméricos
public class Program14 {
    public static void main(String[] args) {
        System.out.println("Tipos de Dados - Tipos Alfanuméricos");

        //Tipos primitivos
        char let1 = 'a'; //Aspas simples
        char let2 = 97; //97 em decimal == 'a'
        //char let4 = "a"; -> Errado
        //String nome = "adds"; -> Não existe o tipo primitivo string em Java

        System.out.println("Letra 1: " + let1);

        let2 = (char) (let2 + 1); //Cast

        System.out.println("Letra 1: " + let1);
        System.out.println("Letra 2: " + let2);

        //Tipos não primitivos
        char let3 = 'A';
        String nome = "Gabriel Conceição";

        System.out.println("Letra 3: " + let3);

        System.out.println("char/Character: " + Character.SIZE + " bits");

        System.out.println("Valor MAX char/Character: " + Character.SIZE + Character.MAX_VALUE);
        System.out.println("Valor MIN char/Character: " + Character.SIZE + Character.MIN_VALUE);

        System.out.println("Nome: " + nome);
        System.out.println("Tamanho da String: " + nome.length());
        System.out.println("String: " + (Character.SIZE) * nome.length() + " bits");
    }
}
