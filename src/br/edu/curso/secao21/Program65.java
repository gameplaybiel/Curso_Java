package br.edu.curso.secao21;

import java.util.LinkedList;

/*
Conjuntos

-> Uma das características dos conjuntos é a não aceitação de elementos repetido.

Gera performance
A = ["Angelina", "Angela", "Adriano", ...]
B = ["Bárbara", "Beatriz", "Barnabé", ...]
C = ["Cássia", "Camila", "Carlos", ...]
...
...
Z = ["Zuleica", "Zagalo", "Zamael", ...]
 */
public class Program65 {
    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto();

        System.out.println(conjunto);

        conjunto.adiciona("Ana");
        conjunto.adiciona("Felicity");
        conjunto.adiciona("Gabriela");
        conjunto.adiciona("Júlia");
        conjunto.adiciona("Fabiana");

        conjunto.remove("Júlia");

        System.out.println(conjunto);
    }
}
