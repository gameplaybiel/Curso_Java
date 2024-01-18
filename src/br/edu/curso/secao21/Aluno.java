package br.edu.curso.secao21;

public class Aluno {
    private String nome;

    public Aluno(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return outro.getNome().equals(this.nome); //Facilita a visualização do array
    }
}
