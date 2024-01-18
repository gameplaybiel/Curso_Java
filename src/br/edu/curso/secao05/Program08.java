package br.edu.curso.secao05;

import java.util.Scanner;

/*Receba os dados do usuário enquanto a idade for maior que 0*/
//Do While
public class Program08 {
    public static void main(String[] args) {
        String nome;
        int idade = 1;

        Scanner sc = new Scanner(System.in);

        //Primeiro, executar o código, na seguida, faz a checagem...
        do{
            System.out.println("Informe o seu nome:");
            nome = sc.nextLine();

            System.out.println("Informe a sua idade:");
            //idade = sc.nextInt(); Portanto dá um bug
            idade = Integer.parseInt(sc.nextLine());

            System.out.println("O seu nome é " + nome + " e a sua idade é " + idade + " anos");
        }while(idade > 0);
        sc.close();
    }
}
