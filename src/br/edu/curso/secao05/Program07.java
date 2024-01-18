package br.edu.curso.secao05;

import java.util.Scanner;

/*Receba os dados do usuário enquanto a idade for maior que 0*/
//While e Do While
public class Program07 {
    public static void main(String[] args) {

        String nome;
        int idade = 1;

        Scanner sc = new Scanner(System.in);

        //Sempre que checar o valor antes de executar o código
        while(idade > 0) {
            System.out.println("Informe o seu nome:");
            nome = sc.nextLine();

            System.out.println("Informe a sua idade:");
            //idade = sc.nextInt(); Portanto dá um bug
            idade = Integer.parseInt(sc.nextLine());

            System.out.println("O seu nome é " + nome + " e a sua idade é " + idade + " anos");
        }
        sc.close();
    }
}
