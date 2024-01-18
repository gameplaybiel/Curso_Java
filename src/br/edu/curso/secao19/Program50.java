package br.edu.curso.secao19;

import br.edu.curso.secao11.Cliente;
import br.edu.curso.secao11.Conta;
import java.util.HashMap;
import java.util.Map;

/*
Collections
HashMap -> A classe HashMap implementa a interface Map e trabalha com chave/valor
           Não aceita chaves duplicadas, mas valores sim
*/
public class Program50 {
    public static void main(String[] args) {
        Map<String, Conta> contas = new HashMap<String, Conta>();

        Cliente cl1 = new Cliente(20, "Angelina Jolie", "Rua da Paz 1");
        Cliente cl2 = new Cliente(24, "Felicity Jones", "Rua da Liberdade 2");

        Conta c1 = new Conta(1, 600, 300, cl1);
        Conta c2 = new Conta(2, 500, 200, cl2);

        contas.put("Pessoa Física", c1);
        contas.put("Pessoa Jurídica", c2);

        //System.out.println(contas.size());
        System.out.println(contas.get("Pessoa Física"));
        System.out.println(contas.get("Pessoa Jurídica"));
    }
}
