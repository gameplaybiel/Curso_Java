package br.edu.curso.secao21;

public class Program57 {
    public static void main(String[] args) {

        Vetor lista = new Vetor();

        for(int i = 0; i < 100; i++){
            Aluno a1 = new Aluno("Maria " + i);
            System.out.println(a1);
        }

        System.out.println(lista);
        System.out.println(lista.tamanho());
    }
}
