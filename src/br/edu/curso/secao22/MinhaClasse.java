package br.edu.curso.secao22;

public class MinhaClasse implements Teste{

    @Override
    public String mensagem() {
        return "Minha mensagem";
    }

    @Override
    public void meu_metodo() {
        Teste.super.meu_metodo();
    }
}
