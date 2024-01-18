package br.edu.curso.secao07;

//Tipos de Dados -> Operações Matemáticas
public class Program16 {
    public static void main(String[] args) {
        System.out.println("Tipos de Dados -> Operações Matemáticas");

        int num1 = 5, num2 = 9, result;

        //Soma
        result = num1 + num2;
        System.out.println("A soma é: " + result);

        //Subtração
        result = num1 - num2;
        System.out.println("A subtração é: " + result);

        //Multiplicação
        result = num1 * num2;
        System.out.println("A multiplicação é: " + result);

        //Divisão(Inteira)
        result = num1 / num2;
        System.out.println("A divisão é: " + result);

        //Divisão(Real)
        result = num2 / num1;
        System.out.println("A divisão real é: " + result);

        //Módulo
        //Se o resto da divisão por 2 for 0, ele é o par, caso contrário, se for 1, ele é ímpar
        result = num1 % 2;
        System.out.println("O resto da divisão é: " + result);
    }
}
