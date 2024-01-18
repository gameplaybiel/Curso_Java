package br.edu.curso.secao06;

//Tipos de Dados (Tipos Numéricos Parte 2)
public class Program13 {
    public static void main(String[] args) {
        System.out.println("Tipos de Dados (Tipos Numéricos Parte 2)");

        int num1 = 4;   //Inteiro 9999
        short num2 = 4; //Inteiro(curto, menor, baixo) 9999
        byte num3 = 4;  //Inteiro

        //Tipos não primários/primitivos
        Integer num4 = 98;
        short num5 = 7;
        byte num6 = 4;

        System.out.println("Int -> num1: " + num1);
        System.out.println("Short -> num2 " + num2);
        System.out.println("Byte -> num3 " + num3);
        System.out.println("Integer -> num4 " + num4);
        System.out.println("Short -> num5: " + num5);
        System.out.println("Byte -> num6: " + num6);

        System.out.println("int/Integer: " + Integer.SIZE + " bits");
        System.out.println("short/Short: " + Short.SIZE + " bits");
        System.out.println("byte/Byte: " + Byte.SIZE + " bits");

        System.out.println("Valor MAX int/Integer: " + Integer.SIZE + Integer.MAX_VALUE);
        System.out.println("Valor MIN int/Integer: " + Integer.SIZE + Integer.MIN_VALUE);

        System.out.println("Valor MAX short/Short: " + Short.SIZE + Short.MAX_VALUE);
        System.out.println("Valor MIN short/Short: " + Short.SIZE + Short.MIN_VALUE);

        System.out.println("Valor MAX byte/Byte: " + Byte.SIZE + Byte.MAX_VALUE);
        System.out.println("Valor MIN byte/Byte: " + Byte.SIZE + Byte.MIN_VALUE);

    }
}
