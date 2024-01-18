package br.edu.curso.secao20;

import br.edu.curso.secao11.Cliente;
import br.edu.curso.secao11.Conta;

/*
-> Thread Sincronizada
-> Por padrão, as threads não são sincronizadas. Pode ocorrer problemas de uma thread acessar o valor de um objeto
   que ainda não foi atualizado ou ainda as threads executarem depois do valor já estar impresso.

-> O sincronismo ocorre pois durante a execução do método a thread executa um 'lock' (bloqueio) da função para que
   outra thread só possa executá-la pós a finalização da thread inicial.
*/

public class Program54 {
    public static void main(String[] args) throws InterruptedException {
        Cliente c1 = new Cliente(31, "José Alves", "Rua da Paz, 1");
        Conta conta1 = new Conta(1, 200, 300, c1); //Saldo de 800

        Depositar acao = new Depositar(conta1);
        Thread t1 = new Thread(acao);
        Thread t2 = new Thread(acao);

        t1.join(); //Avisando que a thread t2 deve 'se juntar' a um sincronizador
        t2.join(); //Pode ocorrer uma exceção do interrupção durante o nosso sincronizador

        t1.start();
        t2.start();


        System.out.println(conta1);
    }
}
