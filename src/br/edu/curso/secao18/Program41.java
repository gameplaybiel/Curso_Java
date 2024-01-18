package br.edu.curso.secao18;
/*
Realizando os cálculos com Math
-> A biblioteca Math possui vários métodos e constantes estáticas para que possamos utilizar nos nossos programas.
*/

public class Program41 {
    public static void main(String[] args) {
        System.out.println(Math.E); //Constante

        //Trigonometria (seno, cosseno, tangente)
        System.out.println(Math.sin(45));
        System.out.println(Math.cos(45));
        System.out.println(Math.tan(45));

        System.out.println(Math.round(Math.PI));
        System.out.println(Math.ceil(Math.PI)); //Arredonda pra cima
        System.out.println(Math.floor(Math.PI));
        System.out.println(Math.pow(3, 2)); //Potência
        System.out.println(Math.round(Math.pow(3, 2)));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.round(Math.sqrt(9)));
    }
}
