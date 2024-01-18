package br.edu.curso.secao05;

//Foreach
public class Program10 {
    public static void main(String[] args) {
        String name = "Gabriel Conceição";

        for(char let: name.toCharArray()) {
            //System.out.println(let);
            System.out.print(let);
        }
    }
}
