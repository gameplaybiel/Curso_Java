package br.edu.curso.secao16;

import java.util.Scanner;

public class Program39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o n1:");
        int n1 = sc.nextInt();

        System.out.println("Informe o n2:");
        int n2 = sc.nextInt();

        try {
            System.out.println(divisao(n1, n2));
        }catch(Exception e){
            System.out.println("Só foi possível realizar a outra execução");
        }

        sc.close();
    }

    //Usando uma função, que avisa que tem possibilidade de lançar uma exceção do tipo Exception
    public static int divisao(int n1, int n2){
        return n1/n2;
    }
}
