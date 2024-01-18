package br.edu.curso.secao17;

/*
Gerando executáveis jar
JAR -> Java Archive (Arquivo compactado) - ZIP/RAR

*/

import br.edu.curso.secao11.Cliente;
import br.edu.curso.secao11.Conta;

import java.util.Scanner;

public class Principal {
        static Cliente cliente = new Cliente(20,"Angrlina Jolie", "Rua da Paz, 45");
        static Conta conta = new Conta(1, 200, 300, cliente);
        static Scanner sc = new Scanner(System.in);

        public static void depositar(){
            System.out.println("====== Depósito ======");
            System.out.println("Informe o valor para o depósito:");
            float valor = sc.nextFloat();
            if(valor > 0){
                conta.depositar(valor);
                System.out.println("O depósito efetuado com sucesso");
            }else{
                System.out.println("O valor precisa ser positivo");
            }
        }

    public static void sacar(){
        System.out.println("====== Saque ======");
        System.out.println("Informe o valor para o saque:");
        float valor = sc.nextFloat();
        if(valor > 0){
            conta.sacar(valor);
            System.out.println("O saque efetuado com sucesso");
        }else{
            System.out.println("O valor precisa ser positivo");
        }
    }

    public static void consultar(){
        System.out.println("O seu saldo/extrato é: " + conta.getSaldo());
    }

    public static void sairConta(){
        System.out.println("Obrigado e volte sempre");
    }

    public static void main(String[] args) {
            int opcao = 0;

        System.out.println("Bem-vindo ao Holder Bank");

        do{
            System.out.println("Escolha umas das opções que o cliente deseja:");
            System.out.println("1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("3- Consultar o saldo/extrato");
            System.out.println("4- Sair");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    depositar();
                    break;
                case 2:
                    sacar();
                    break;
                case 3:
                    consultar();
                    break;
                case 4:
                    sairConta();
                    break;
                default:
                    break;
            }
        }while (opcao > 0);
            sc.close();
    }

}
