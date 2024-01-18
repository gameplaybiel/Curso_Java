package br.edu.curso.secao13;

//Template Method
/*
-> Final é o modificador de acesso que faz com que o elemento que esteja utilizando, não possa
   ser extendido/reescrito.
*/
public abstract class Treinamento {
    public final void treinoDiario(){
        preparoFisico();
        jogoTreino();
        treinoTatico();
    }
    public abstract void preparoFisico();

    public abstract void jogoTreino();

    public final void treinoTatico(){
        System.out.println("Treino tático...");
    }
}
