package br.edu.curso.secao11;
/*
Private
-> é privado a própria classe
-> Ou seja, só temos acesso ao atributo ou método privado dentro da própria classe onde ele foi declarado.

Protected
-> É o modificador de acesso
-> O modificador de acesso Protected faz com que o elemento seja visível somente dentro do mesmo pacote onde o elemento
   foi declarado.
*/

public class Cliente implements Comparable{
    private int idade;
    private String nome;
    private String endereco;

    public Cliente(int idade, String nome, String endereco){
        this.idade = idade;
        this.nome = nome;
        this.endereco = endereco;
    }

     protected void digaOi(){
        System.out.println(this.nome + " dizendo Opa");
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int compareTo(Object outra) {
        Cliente aux = (Cliente)outra;
        if (this.idade < aux.idade){
            return -1;
        }else if(this.idade > aux.idade){
            return 1;
        }else{
            return 0;
        }
    }
}
