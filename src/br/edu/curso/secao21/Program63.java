package br.edu.curso.secao21;

/*
Filas

-> Todo elemento entra no final da fila.
-> O primeiro elemento a entrar é também o o primeiro a sair.

<- [0][1][2][3][4]

*/
public class Program63 {
    public static void main(String[] args) {

        Fila fila = new Fila();
        System.out.println(fila);

        fila.adiciona("Angelina");
        fila.adiciona("Felicity");
        fila.adiciona("Maria");
        System.out.println(fila);

        String ret = fila.remove();
        System.out.println(ret);
        System.out.println(fila);

        fila.remove();
        fila.remove();
        fila.remove();
        System.out.println(fila.vazia());
    }
}
