package br.edu.curso.secao18;

import br.edu.curso.secao11.Conta;

public class Caixa {
    private Object[] objetos;
    private int posicaoLivre;

    public Caixa(){
        objetos = new Object[100]; //Até 100 contas
        posicaoLivre = 0;
    }

    public void adicionarConta(Object nova){
        this.objetos[this.posicaoLivre] = nova;
        this.posicaoLivre++;
    }

    public Object pegar(int posicao){
        return this.objetos[posicao];
    }
}
