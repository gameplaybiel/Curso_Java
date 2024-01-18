package br.edu.curso.secao14;

/*
-> Uma interface pode conter: métodos abstratos, constantes
-> INTERFACE para servir de contrato para produtos eletrônicos.
-> Todo produto eletrônico que implementar essa interface OBRIGATORIAMENTE deverão se implementar os métodos abstratos.
*/

public interface IEletronico {
    public String MARCA = "Geek"; //Constante
    public void ligar();
    public void desligar();
}
