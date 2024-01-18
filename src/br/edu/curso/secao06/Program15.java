package br.edu.curso.secao06;

//Tipos de Dados -> Tipos Booleanos
public class Program15 {
    public static void main(String[] args) {
        System.out.println("Tipos de Dados -> Tipos Booleanos");

        //Tipos Primitivos
        Boolean verdade = true;
        Boolean falso = false;

        Boolean ativo = true;

        //Tipos Não Primitivos
        Boolean V = true;
        Boolean F = false;

        System.out.println("Verdadeiro: " + verdade);
        System.out.println("Falso: " + falso);
        System.out.println("V: " + V);
        System.out.println("F: " + F);

        //A verificação é que se a if retorna se for true ou false
        if(verdade){
            System.out.println("É verdadeiro");
        }else{
            System.out.println("É falso");
        }

        if(1 == 1){
            System.out.println("1 == 1 é verdadeiro");
        }else{
            System.out.println("...é falso");
        }

        if(ativo){
            System.out.println("Pode acessar ao sistema");
        }else {
            System.out.println("Você tem o acesso negado");
        }
    }

}
