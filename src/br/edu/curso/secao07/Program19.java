package br.edu.curso.secao07;

//Matrizes em Java -> Parte 1
//Vetor/array/matriz -> multi-dimnesionais

//Matriz recebe linhas e colunas
//[linhas][colunas]
//int numeros[0][0] = 1;
//int numeros[0][1] = 2;
//int numeros[0][2] = 5;
//int numeros[1][0] = 7;
//int numeros[1][1] = 4;
//int numeros[1][2] = 9;
//int numeros[2][0] = 3;
//int numeros[2][1] = 6;
//int numeros[2][2] = 32;

public class Program19 {
    public static void main(String[] args) {
        System.out.println("Matrizes em Java -> Parte 1");

        //Declarar a matriz
        int numeros[][];

        //Declarar o tamanho da matriz
        int outro_numero[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //Declarar somente as linhas da matriz
        int matriz[][] = new int[2][];
        matriz[0] = new int[5];
        matriz[1] = new int[3];

        int nova_matriz[][] = {{1, 2}, {3, 4, 5, 6, 7, 8}, {9, 10, 11}};
    }
}
