package br.edu.curso.secao21;

import java.util.Arrays;

public class Vetor {
    private Aluno alunos[] = new Aluno[100];
    private int total = 0;

    public void adicionarAluno(Aluno aluno) {
        this.garantirEspaco();
        this.alunos[total] = aluno;
        total = total + 1;
    }

    public void adicionar(int posicao, Aluno aluno){
        if (!posicaoOcupada(posicao)){
        }
        for(int i = total - 1; i >= posicao; i-=1){
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;
        total++; //total = total + 1;
    }
    public Aluno pega(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.alunos[posicao];
    }

    public void remove(int posicao){
        for(int i = posicao; i < this.total; i++){
            this.alunos[i] = this.alunos[i + 1];
        }
        total--;
    }

    public boolean contem(Aluno aluno){ //Verificar se aluno está na lista ou não
        for(int i = 0; i < total; i++){
            if(aluno.equals(alunos[i])){
                 return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return this.total;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.alunos); //Facilita a visualização do Arrays
    }

    private boolean posicaoOcupada(int posicao){
        return posicao > 0 && posicao < total;
    }

    private void garantirEspaco(){
        /*Verifica se o aluno está cheio ou não */
        if(total == alunos.length){
            /*Caso esteja cheio, cria um novo array com o dobro de tamanho do array anterior*/
            Aluno novoArray[] = new Aluno[alunos.length * 2];
            /*Copia os dados do array anterior para o novo array*/
            for(int i = 0; i < alunos.length; i++){
                novoArray[i] = alunos[i];
            }
            /*Por último, atribuímos o novo array para ao array original */
            this.alunos = novoArray;
        }
    }
}
