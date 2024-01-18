package br.edu.curso.secao15;

//Atributos e Métodos Estáticos
/*
-> Atributos Estáticos são atributos, onde os valores são compartilhados entre as instâncias da classe.
*/

public class Program35 {
    public static void main(String[] args) {

        Conta c1 = new Conta("Angelina Jolie");
        System.out.println("O cliente: " + c1.getNumero() + " " + c1.getCliente());

        Conta c2 = new Conta( "Felicity Jones");
        System.out.println("O cliente: " + c2.getNumero() + " " + c2.getCliente());

        Conta c3 = new Conta( "Luis Miguel Martini");
        System.out.println("O cliente: " + c3.getNumero() + " " + c3.getCliente());

        System.out.println("O contador é: " + Conta.contador);
    }
}
