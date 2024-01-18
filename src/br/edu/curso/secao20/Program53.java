package br.edu.curso.secao20;

/*
Threads em Java
-> Simulação da geração do relatório + barra de tarefa
-> Com a utilização do Threads
*/
public class Program53 {
    public static void main(String[] args) {
        BarraDeProgresso barra = new BarraDeProgresso();
        Thread t1 = new Thread(barra);
        t1.start();

        GerarRelatorio relatorio = new GerarRelatorio();
        Thread t2 = new Thread(relatorio);
        t2.start();

    }
}
