package br.edu.curso.secao04;

public class Programa05 {
    public static void main(String[] args) {
        System.out.println("Programa de operador ternário");

        int value = -3, number;

        /*
        if(value > 0){
            number = value;
        }else{
            number = 7;
        }
         */
        //Operador ternário
        number =  (value > 0) ? value : 7;

        System.out.println(number);
    }
}
