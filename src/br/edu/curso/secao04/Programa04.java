package br.edu.curso.secao04;

//Programa de Estruturas de decisão (if, else e if else)
public class Programa04 {
    public static void main(String[] args) {
        //Declarando e inicializando a variável
        //se(number > 5){
        //  escreva("Sim, o número é maior que 5);
        //}senão{
        //  escreva("Sim, o número é igual a 5);
        // }
        // senão{
        //  escreva("Sim, o número não é maior que 5);
        //}

        System.out.println("Programa de Estruturas de decisão (if, else e if else)");

        int number = 4;

        if(number > 5){
            System.out.println("Sim, o número é  maior que 5");
        } else if (number == 5) {
            System.out.println("O número é igual a 5");
        } else if (number % 2 == 0) {
            System.out.println("O número é par.");
        } else{
            System.out.println("Não, o número é  menor que 5");
        }
    }
}
