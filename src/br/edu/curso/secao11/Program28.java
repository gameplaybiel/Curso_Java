package br.edu.curso.secao11;
/*
Private
-> é privado a própria classe
-> Ou seja, só temos acesso ao atributo ou método privado dentro da própria classe onde ele foi declarado.

Protected
-> É o modificador de acesso
-> O modificador de acesso Protected faz com que o elemento seja visível somente dentro do mesmo pacote onde o elemento
   foi declarado.
*/

public class Program28 {
    public static void main(String[] args) {

        Cliente cli1 = new Cliente(20,"Felcity Jones", "Rua da Barra, 256");
        Cliente cli2 = new Cliente(24,"Angelina Jolie", "Rua Outra, 355");

        cli1.digaOi();
        System.out.println("Nome: " + cli1.getNome() + " | Endereço: " + cli1.getEndereco());
        cli2.digaOi();
        System.out.println("Nome: " + cli2.getNome() + " | Endereço:  " + cli2.getEndereco());
    }


}
