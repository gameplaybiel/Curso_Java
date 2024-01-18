package br.edu.curso.secao06;

//Tipo de Dados
//Tipos Numéricos Parte 2(Inteiros e Reais)
public class Program12 {
    public static void main(String[] args) {

        System.out.println("Tipos de Dados - (Tipos Numéricos Parte 2)");

        //Tipos primários/primitivos
        //Por padrão, os números reais em Java são usados em um comando "Double"
        float preco1 = 25.5f;
        double preco2 = 25.5;

        //Tipos não primários/primitivos
        float preco3 = 34.4f;
        double preco4 = 34.4;

        System.out.println("Float  -> preco1: " + preco1);
        System.out.println("Double -> preco2: " + preco2);
        System.out.println("Float  -> preco3: " + preco3);
        System.out.println("Double -> preco4: " + preco4);

        System.out.println("Valor MAX float/Float: " + Float.SIZE + Float.MAX_VALUE);
        System.out.println("Valor MIN float/Float: " + Float.SIZE + Float.MIN_VALUE);

        System.out.println("Valor MAX double/Double: " + Double.SIZE + Double.MAX_VALUE);
        System.out.println("Valor MIN double/Double: " + Double.SIZE + Double.MIN_VALUE);
    }
}
