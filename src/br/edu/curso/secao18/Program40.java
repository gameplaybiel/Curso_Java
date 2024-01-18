package br.edu.curso.secao18;

import br.edu.curso.secao11.Cliente;
import br.edu.curso.secao11.Conta;

//Object: A mãe de todas as classes
/*
A classe Object faz parte do pacote java.ang
*/
public class Program40 {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente(20,"Angelina Jolie", "Rua 1, 234");
        Cliente cli2 = new Cliente(34,"Felicity Jones","Rua 2 , 345");

        Conta c1 = new Conta(1, 200, 300, cli1);
        Conta c2 = new Conta(2, 300, 300, cli2);

        Caixa prateleira = new Caixa();

        System.out.println(c1); //Por padrão, a instância imprime com toString();
        System.out.println(c2);

        if(c1.equals(cli1)){
            System.out.println("São a mesma conta");
        }else{
            System.out.println("São contas diferentes");
        }

        prateleira.adicionarConta(c1); // 0 -> tem getSaldo();
        prateleira.adicionarConta(c2); // 1 -> tem getSaldo();

        System.out.println(((Conta)prateleira.pegar(0)).getSaldo());//Cast

        prateleira.adicionarConta(cli1);

        System.out.println(((Cliente)prateleira.pegar(2)).getNome());

        if((Object)cli1 instanceof Conta){
            System.out.println("O objeto é do tipo Conta");
        }
    }
}
