package br.edu.curso.secao06;

//Tipo de Dados
//Tipos Numéricos Parte 1(Inteiros e Reais)
public class Program11 {
    public static void main(String[] args) {

        System.out.println("Tipos de Dados - (Tipos Numéricos Parte 1)");
        int num1 = 4;   //Inteiro 9999
        short num2 = 4; //Inteiro(curto, menor, baixo) 9999
        Long num5 = (long) 999999; //Inteiro 9999999999999999
        char num7 = 84;

        //Tipos não primários/primitivos
        Integer num3 = 98;
        short num4 = 7;
        Long num6 = (long) 888888;
        Character num8 = 90;

        System.out.println("Int -> num1: " + num1);
        System.out.println("Short -> num2 " + num2);
        System.out.println("Integer -> num3 " + num3);
        System.out.println("Short -> num4 " + num4);
        System.out.println("Long -> num5 " + num5);
        System.out.println("Long -> num6 " + num6);
        System.out.println("Char -> num7: " + num7);
        System.out.println("Char -> num8: " + num8);

        System.out.println("int/Integer: " + Integer.SIZE + " bits");
        System.out.println("short/Short: " + Short.SIZE + " bits");
        System.out.println("byte/Byte: " + Byte.SIZE + " bits");
        System.out.println("long/Long: " + Long.SIZE + " bits");
        System.out.println("char/Character: " + Character.SIZE + " bits");

        System.out.println("Valor MAX int/Integer: " + Integer.SIZE + Integer.MAX_VALUE);
        System.out.println("Valor MIN int/Integer: " + Integer.SIZE + Integer.MIN_VALUE);

        System.out.println("Valor MAX short/Short: " + Short.SIZE + Short.MAX_VALUE);
        System.out.println("Valor MIN short/Short: " + Short.SIZE + Short.MIN_VALUE);

        System.out.println("Valor MAX byte/Byte: " + Byte.SIZE + Byte.MAX_VALUE);
        System.out.println("Valor MIN byte/Byte: " + Byte.SIZE + Byte.MIN_VALUE);

        System.out.println("Valor MAX long/Long: " + Long.SIZE + Long.MAX_VALUE);
        System.out.println("Valor MAX long/Long: " + Long.SIZE + Long.MIN_VALUE);

        System.out.println("Valor MAX char/Character: " + Character.SIZE + Character.MAX_VALUE);
        System.out.println("Valor MIN char/Character: " + Character.SIZE + Character.MIN_VALUE);
    }
}
