package br.edu.curso.secao25;

import br.edu.curso.secao25.Model.Produto;

public class Teste {
    public static void main(String[] args) {
        Produto ps4 = new Produto("PlayStation 4", 1789.44);
        Produto xbox = new Produto("Xbox 360", 1699.00);

        System.out.println(ps4);
        System.out.println(xbox);
    }
}
