package br.edu.curso.secao13;

import br.edu.curso.secao12.Aluno;

//Classes abstratas
/*
-> É um recurso que proporciona um bloqueio na criação de objetos.
-> Não conseguimos instanciar objetos de uma classe abstrata.
-> Dessa forma, impossibilitamos a criação de objetos desta classe
-> Uma classe abstrata pode ter: atributos, métodos, métodos abstratos.
-> Métodos abstratos: São métodos, que não possuem implementação, possuem apenas declaração, e
   obrigatoriamente, as classes que herdarem desta classe com método abstrato, precisa implementar estes métodos.
*/
public class Program32 {
    public static void main(String[] args) {

        Aluno maria = new Aluno("Maria da Silva", 1999, "maria@gmail.com", "123456");

        System.out.println(maria);

        maria.outraMensagem("Meu nome é " + maria.getNome());

    }
}
