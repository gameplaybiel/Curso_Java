package br.edu.curso.secao09;

import br.edu.curso.secao09.Pessoa;

//Orientação a Objetos -> Construtor
/*
-> O construtor de uma classe SEMPRE tem o mesmo nome da classe;
-> Por padrão da Java, o JVM(Java Virtual Machine), cria um tempo de execução, um construtor padrão, um construtor vazio;
-> Podemos ter mais de um construtor da classe
*/
public class Program24 {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa(); //(Método) Construtor
        pessoa1.nome = "Felicity Jones";
        pessoa1.email = "felicity@gmail.com";
        pessoa1.ano_nasc = 1986;

        pessoa1.mostrarInformacoes();
        System.out.println("");
        Pessoa pessoa2 = new Pessoa("Angelina Jones", "angelina@gmail.com", 1976);
        pessoa2.mostrarInformacoes();
    }
}
