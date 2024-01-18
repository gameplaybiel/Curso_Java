package br.edu.curso.secao21;

import br.edu.curso.secao11.Cliente;

/*
Listas Ligadas/LinkedList
-> EM um vetor, os elementos estão um do lado, enquanto em uma lista ligada, eles estão em lugares diferentes,
   porém um aposta para o outro indicando o próximo elemento.

   [0][3][1][2][5][4][null]

*/
public class Program58 {
    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        System.out.println(lista);

       lista.adiciona("Angelina");
       System.out.println(lista);
       lista.adiciona("Maria");
       lista.adiciona("Felicity");
       System.out.println(lista);
       lista.removeDoComeco();
       System.out.println(lista);
    }
}
