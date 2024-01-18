package br.edu.curso.secao20;

/*
-> Para executar métodos em paralelo, nossa classe deve implementar a interface Runnable, e o método que precisar ser
   executado em paralelo deve ser executado em dentro do método run
*/
public class BarraDeProgresso implements Runnable{

    public void executar(){
        //For 1 até 10 milhões
        for(int i = 0; i < 100; i ++){
            System.out.println(i + " Barra de progresso, aguarde....");
        }
    }
    @Override
    public void run() {
        //For 1 até 10 milhões
        for(int i = 0; i < 100; i ++){
            System.out.println(i + " Barra de progresso, aguarde....");
        }
    }
}
