package br.edu.curso.secao20;

/*
Threads em Java
-> Simulação da geração do relatório + barra de tarefa
-> Sem a utilização do Threads

*/
public class Program52 {
    public static void main(String[] args) {
        BarraDeProgresso barra = new BarraDeProgresso();
        barra.executar();

        GerarRelatorio gerarRelatorio = new GerarRelatorio();
        gerarRelatorio.gerarRelatorio();
    }
}
