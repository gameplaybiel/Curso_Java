package br.edu.curso.secao07;

//Vetores em Java -> Parte 2
//Os vetores possuem um tamanho fixo e não podem ser aumentados/diminupidos
public class Program18 {
    public static void main(String[] args) {
        System.out.println("Vetores em Java -> Parte 2");

        //Declarando e definir o tamanho do vetor
        int numeros[] = new int[10];

        System.out.println("Tamanho vo vetor: " + numeros.length);

        for(int i = 0; i < numeros.length; i++){
            //numeros[0] = i + 3;
            numeros[i] = i + 3;
            //numeros[9] = i + 3
        }

        System.out.println(numeros[0]); //Primeiro elemento
        System.out.println(numeros[9]); //Último elemento

        //0...9
        //numeros[10] = 42;
        //System.out.println("O vetor é: " + numeros[10]);

        numeros[0] = 7;
        System.out.println(numeros[0]); //Primeiro elemento

        //numeros[0] = 24.4f;
        //Os vetores/arrays possuem os tipos de dados fixos e não aceitam os tipos variados

        //A função random() é um método estático disponibilizado pela classe Math da linguagem Java.
        //Esse método retorna números aleatórios do tipo double, mas apenas aqueles incluídos no intervalo de 0.0 até 1.0.
        //A função random() também serve para arredonar valores aleatórios

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int)Math.round(Math.random() * 10);
        }
        System.out.println(numeros[0]); //Primeiro elemento
        System.out.println(numeros[9]); //Último elemento

        //0..1 double
        System.out.println(Math.random());

        System.out.println(Math.random() * 10);

        System.out.println(Math.round(Math.random() * 10));

        for(int i : numeros){
            System.out.println(i);
        }
    }
}
