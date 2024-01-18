package br.edu.curso.secao16;

//Tratamento de Erros (try e catch)

import java.util.Scanner;
public class Program38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a primeira divisão:");
        int num1 = sc.nextInt();

        System.out.println("Informe a segunda divisão:");
        int num2 = sc.nextInt();

        try {
            System.out.println("A divisão de " + num1 + " por " + num2 + " é: " + num1/num2);
        }catch (ArithmeticException ex){
            System.out.println("Não é possível realizar essa divisão");
        }

        System.out.println("Faça isso também...");

        sc.close();
    }
}
