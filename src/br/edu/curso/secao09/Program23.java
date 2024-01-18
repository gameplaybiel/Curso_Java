package br.edu.curso.secao09;

//Objetos -> são produtos/instanciadas da classes

public class Program23 {
    public static void main(String[] args) {
        int numero = 4;

        //Declarar um objeto;
        Produtos p0;

        //Declaração e instanciação/Inicializar o objeto
        //P1 -> instancia um objeto
        Produtos p1 = new Produtos();
        p1.nome = "Notebook";
        p1.preco = 2.367f;
        p1.desconto = 15.0f;

        Produtos p2 = new Produtos();
        p2.nome = "Caneta Bic";
        p2.preco = 2.45f;
        p2.desconto = 5;

        System.out.println("====== Produtos ======");
        System.out.println("Nome do produto: " + p1.nome);
        System.out.println("Preço do produto: " + p1.preco);
        System.out.println("Desconto do produto: " + p1.desconto + "%");
        System.out.println("");
        System.out.println("Nome do produto: " + p2.nome);
        System.out.println("Preço do produto: " + p2.preco);
        System.out.println("Desconto do produto: " + p2.desconto + "%");
        System.out.println("");
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Angelica Jones";
        pessoa1.email = "angelicajones@gmail.com";
        pessoa1.ano_nasc = 1976;

        System.out.println("===== Pessoas =====");
        System.out.println("Nome: "+ pessoa1.nome);
        System.out.println("E-mail: " + pessoa1.email);
        System.out.println("Ano de nascimento: " + pessoa1.ano_nasc);


    }
}