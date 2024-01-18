package br.edu.curso.secao15;

//Métodos Estáticos
/*
-> Um método estático, não depende de uma instância da classe para ser utilizado.

Pode-se utilizar conforme:
NomeDaClasse.metodo();
*/
public class Program36 {
    public static void main(String[] args) {
        Conta c1 = new Conta("Luis Miguel Martini");
        System.out.println("Número do cliente: " + c1.getNumero());
        System.out.println("Nome do cliente: " + c1.getCliente());
        System.out.println("A próxima conta é: " + Conta.proximaConta());
    }
}
