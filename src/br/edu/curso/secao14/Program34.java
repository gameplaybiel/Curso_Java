package br.edu.curso.secao14;

//Interface
/*
-> Interfaces são conhecidas como 'contratos'.
-> Quem implementar o contrato, é OBRIGADO a seguir as regras.
-> Uma empresa criou um contrato 'com regras' para a criação de um produto/serviço.
-> O João decidiu criar um produto/serviço baseado neste contrato.
-> O contrato para a confecção do bolo, o bolo deverá ter:
                                                        -> Deve ser de chocolate
                                                        -> Com cobertura
                                                        -> Deve ser recheado

*/

public class Program34 {
    public static void main(String[] args) {
        Ventilador vent = new Ventilador();

        System.out.println("A marca do aparelho é: " + vent.MARCA);
        vent.ligar();
        vent.desligar();
    }
}
