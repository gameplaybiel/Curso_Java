package br.edu.curso.secao21;

/*
-> Estruturas de Dados em Java
-> Armazenamento sequencial
*/
public class Program56 {
    public static void main(String[] args) {

       Aluno a1 = new Aluno("Angrlina");
       Aluno a2 = new Aluno("Felicity");

       Vetor lista = new Vetor();

        System.out.println("Total de alunos: " + lista.tamanho());

        lista.adicionarAluno(a1);
        System.out.println("Total de alunos: " + lista.tamanho());

        lista.adicionarAluno(a2);
        System.out.println("Total de alunos: " + lista.tamanho());

        System.out.println(lista);

        System.out.println(lista.contem(a1));

        try{
            System.out.println(lista.pega(101));
        }catch(IllegalArgumentException e){
            System.out.println("O aluno da posição 101 não existe");
            System.out.println(e.getMessage());
        }

        Aluno a3 = new Aluno("Maria");
        try {
            lista.adicionar(1, a3);
        }catch(IllegalArgumentException e){
            System.out.println("A posição 101 é inválida");
        }

        lista.remove(0);
        System.out.println(lista);
    }
}
