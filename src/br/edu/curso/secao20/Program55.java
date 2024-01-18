package br.edu.curso.secao20;

import br.edu.curso.secao11.Cliente;
import br.edu.curso.secao11.Conta;

/*
-> Thread Não Sincronizada
-> Por padrão, as threads não são sincronizadas. Pode ocorrer problemas de uma thread acessar o valor de um objeto
   que ainda não foi atualizado ou ainda as threads executarem depois do valor já estar impresso.
*/


public class Program55 {
    public static void main(String[] args) throws InterruptedException {
        Cliente c1 = new Cliente(31, "José Alves", "Rua da Paz, 1");
        Conta conta1 = new Conta(1, 200, 300, c1); //Saldo de 800

        Depositar acao = new Depositar(conta1);
        Thread t1 = new Thread(acao);
        Thread t2 = new Thread(acao);

        t1.start();
        t2.start();


        System.out.println(conta1);
    }

}
