package br.edu.curso.secao12;
/*
Benefícios da Herança:
-> Evita a repetição do código
-> Facilita a manutenção do programa
 */
//Aluno é uma Pessoa
/*
-> Quando uma classe herda de outra classe ela ganha;
-> TODOS os atributos e métodos da classe herdada

-> Classe específica: sub-classe, classe-filha
*/
public class Aluno extends Pessoa{
    private String ra;
    public Aluno(String nome, int ano_nascimento, String email, String ra){
        super(nome, ano_nascimento, email);
        this.ra = ra;
    }
    public String getRa() {
        return this.ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }

    //Overriding: Sobrescrita de métodos
    @Override
    public String toString() {
        return super.toString() + "\nR.A.: " + this.ra;
    }

    //Overriding: Sobrescrita de métodos
    @Override
    public String getNome() {
        return "Aluno: \n" + super.getNome();
    }
}
