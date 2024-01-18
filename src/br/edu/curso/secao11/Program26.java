package br.edu.curso.secao11;

//Seção 11: Modificadores de Acesso
//Encapsulamento
public class Program26 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(21,"João da Silva", "Avenida Paulista, 445");
        Cliente c2 = new Cliente(20,"Gabriel de Souza",  "Avenida Alexandre Maion, 555");

        Conta conta1 = new Conta(1, 600.0f, 200.0f, c1);
        Conta conta2 = new Conta(2, 450.0f, 500.0f, c2);

        System.out.println("Saldo do Cliente 1(Antes do Saque): " + conta1.getSaldo());
        System.out.println("Saldo do Cliente 2: " + conta2.getSaldo());

        conta1.sacar(300);
        System.out.println("O saldo atual do Cliente 1 é: " + conta1.getSaldo());
        System.out.println("O saldo atual do Cliente 2 é: " + conta2.getSaldo());

        System.out.println("O saldo atual do Cliente 1 é: " + conta1.getSaldo());
    }
}
