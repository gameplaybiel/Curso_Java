package br.edu.curso.secao09;

/*
->Orientação a Objetos -> Classes
->Classe: Produto
->O nome das classes inicializa com a letra maiúscula
->O nome das classes não deve conter acentuação, caracteres especiais, espaço
->Nas classes em Java, não existe a implementação da função main()
->Toda classe Java possui a seguinte forma:
->O nome da classe Java PRECISA ser o mesmo nome do arquivo do Java
->Tudo que estiver nas chaves {} faz parte da classe.
->Atributos: são características da classe/molde/modelo de dados
->Podemos entender atributos como variáveis da classe.
-> Os atributos são nomeados em letras minúsculas, sem espaço, sem acentuação, sem caracteres especiais
-> Métodos: Podemos entender os métodos como a ação é realizada para os objetos da classe
-> Métodos: Podemos entender os métodos são os comportamentos dos objetos da classe
public class NomeDaClasse{
}
 */

public class Produtos {
    String nome;
    float preco;
    float desconto;

    //Método para aumentar o preço do projeto em 10
    void aumentar_preco(float value){
        this.preco = this.preco + value;
    }
}
