package br.edu.curso.secao09;

/*
-> Orientação a Objetos -> Atributos
-> Classe: Pessoa
-> Atributos: são características da classe/molde/modelo de dados
-> Podemos entender atributos como variáveis da classe.
-> Outra forma da nomenclatura para os atributos são estados.
-> Os atributos são nomeados em letras minúsculas, sem espaço, sem acentuação, sem caracteres especiais
-> Métodos: Podemos entender os métodos como a ação é realizada para os objetos da classe
-> Métodos: Podemos entender os métodos são os comportamentos dos objetos da classe
-> Construtor: Sempre um construtor vazio possui a seguinte forma:
    public nomeDaClasse(){}
 */
public class Pessoa {
    String nome, email;
    int ano_nasc;

    //Construtor vazio
    public Pessoa(){

    }

    //Construtor com parâmetros
    public Pessoa(String nome, String email, int ano_nasc){
        //this -> objeto
        this.nome = nome;
        this.email = email;
        this.ano_nasc = ano_nasc;
    }

    void mostrarInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Ano de nascimento: " + this.ano_nasc);
    }
}
