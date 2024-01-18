package br.edu.curso.secao20;

public class GerarRelatorio implements  Runnable{

    public void gerarRelatorio() {
        //For 1 até 10 milhões
        for(int i = 0; i < 100; i ++){
            System.out.println(i + " Barra de progresso, aguarde....");
        }
    }

    @Override
    public void run() {
        //For 1 até 10 milhões
        for(int i = 0; i < 100; i ++){
            System.out.println(i + " Gerando relatório, aguarde....");
        }
    }
}
