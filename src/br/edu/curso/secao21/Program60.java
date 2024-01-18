package br.edu.curso.secao21;
/*
-> Listas Duplamente Ligadas
 */
public class Program60 {
    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        System.out.println(lista);

        lista.adiciona("Angelina");
        System.out.println(lista);
        lista.adiciona("Maria");
        System.out.println(lista);
        lista.adiciona("José");
        System.out.println(lista);

        //lista.remove(0);
        //System.out.println(lista);

        System.out.println(lista.contem("Angelina"));
    }
}
