package br.edu.curso.secao13;

public class TreinamentoFinal extends Treinamento{
    @Override
    public void preparoFisico() {
        System.out.println("Preparo físico do fim da temporada");
    }

    @Override
    public void jogoTreino() {
        System.out.println("Jogo treino do fim da temporada");
    }
}
