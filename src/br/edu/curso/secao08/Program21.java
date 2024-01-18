package br.edu.curso.secao08;

import java.util.Scanner;

//Funções em Java
/*
Crie um programa que receba diversos nomes de frutas do usuário e no final, imprimir
essas frutas em ordem contrária. O programa deve ser solicitada ao usuário quantas frutas
ele irá te informar.
*/
public class Program21 {

    //Variáveis globais
    static Scanner sc = new Scanner(System.in);
    static String fruta[];
    static int i;

    public static void main(String[] args) {
        System.out.println("Funções em Java");

        //Definir o tamanho do vetor (Variáveis locais)
        int qtd;

        System.out.println("Informe a quantidade de frutas:");
        qtd = Integer.parseInt(sc.nextLine());

        //Definir o tamanho do vetor
        fruta = new String[qtd];

        //(0..2) -> 0, 1, 2
        for(i = 0; i < qtd; i++){ //i++ -> i = i + 1
            System.out.println("Informe o nome de " + (i + 1) + " fruta:");
            fruta[i] = sc.nextLine();
        }

        for(i = 2; i >= 0; i--){ //i-- -> i = i- 1
            System.out.println(fruta[i]);
        }

        cadastrarDados(qtd);
        mostrarDados(qtd);

        sc.close();
    }

    /*
    Uma função deve ter o seguinte:
    a) Tipo de retorno -> (Tipo de dado que a função vai retornar);
    b) Nome -> Corresponde a ação que a função realizar;
    c) Parâmetros/Argumentos de entrada -> (Opcional);
    d) Retorno -> (Opcional, depende do tipo de retorno)
    */

    static void cadastrarDados(int quantidade){
        //Definir o tamanho do vetor
        fruta = new String[quantidade];

        //(0..2) -> 0, 1, 2
        for(i = 0; i < quantidade; i++){ //i++ -> i = i + 1
            System.out.println("Informe o nome de " + (i + 1) + " fruta:");
            fruta[i] = sc.nextLine();
        }
    }

    static void mostrarDados(int quantidade){
        for(i = (quantidade - 1); i >= 0; i--){ //i-- -> i = i- 1
            System.out.println("As frutas são: "+ fruta[i]);
        }
    }
}
