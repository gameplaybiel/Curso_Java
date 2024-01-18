package br.edu.curso.secao12;
/*
- Classe base
- Classe mãe
- Classe pai
- Super classe
- Classe genérica
*/

//Agora como classe abstrata
public abstract class Pessoa {
    private String nome;
    private int ano_nasc;
    private String email;

    public Pessoa(){}

    public Pessoa(String nome, int ano_nasc, String email) {
        this.nome = nome;
        this.ano_nasc = ano_nasc;
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno_nasc() {
        return ano_nasc;
    }

    public void setAno_nasc(int ano_nasc) {
        this.ano_nasc = ano_nasc;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " Ano de nascimento: " + this.ano_nasc;
    }

    //Overloading: Sobrecarga de método
    public void Mensagem(String msg){
        System.out.println(msg);
    }

    //Overloading: Sobrecarga de método
    public void dizerMensagem(String msg, int num){
        System.out.println(msg + num);
    }

    //Declaração de um método abstrato
    public void outraMensagem(String texto){
        System.out.println(texto);
    }
}
