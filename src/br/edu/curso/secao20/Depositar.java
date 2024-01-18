package br.edu.curso.secao20;

import br.edu.curso.secao11.Conta;

public class Depositar implements Runnable {
    private Conta conta;

    public Depositar(Conta conta){
        this.conta = conta;
    }

    @Override
    public void run() {
        this.conta.depositar(100.0f);
    }
}
