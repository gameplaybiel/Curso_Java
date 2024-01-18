package br.edu.curso.secao22;

/*
Revisão
- Classes anônimas;
- Lambdas;
- Method References;
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program76 {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Programação para Leigos", 170));
        cursos.add(new Curso("Algoritmos e Lógica de Programação: Essencial", 280));
        cursos.add(new Curso("Programação em C: Essencial", 125));
        cursos.add(new Curso("Programação em Java: Essencial", 0));
        cursos.add(new Curso("Programação em Python: Essencial", 0));
        cursos.add(new Curso("Banco de Dados: Essencial", 0));

        //cursos.sort(Comparator.comparing(c -> c.getAlunos())); //Lambda
        cursos.sort(Comparator.comparing(Curso::getAlunos)); // Method Reference

        //cursos.forEach(c -> System.out.println(c.getNome())); // Lambda
        cursos.forEach(System.out::println); //Method References
    }
}
