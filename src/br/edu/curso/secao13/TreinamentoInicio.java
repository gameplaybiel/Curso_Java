package br.edu.curso.secao13;

public class TreinamentoInicio extends Treinamento{
    @Override
    public void preparoFisico() {
        System.out.println("Preparo físico do início da temporada");
    }

    @Override
    public void jogoTreino() {
        System.out.println("Jogo treino do início da temporada");
    }
}
