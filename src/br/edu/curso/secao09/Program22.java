package br.edu.curso.secao09;


//Funções em Java -> Parte 2
public class Program22 {
    public static void main(String[] args) {
        System.out.println("Funções em Java -> Parte 2");

        int valor1 = 6, valor2 = 4; //res;

       //res = soma(valor1, valor2);

        //System.out.println("O resultado é: " + res);
        System.out.println("O resultado é: " + soma(valor1, valor2, "Hello"));
        System.out.println(messages());
    }

    //Quando cria uma função, ele retorna com os variáveis já existentes
    static int soma(int v1, int v2, String msgs){
        System.out.println(msgs);
        return v1 + v2;
    }

    static String messages(){
        return "Hello user";
    }
}
