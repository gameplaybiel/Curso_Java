package br.edu.curso.secao18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

//Leitura e Escrita em arquivos - Parte 2
public class Program45 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            /*  Desta forma, toda vez que o programa for executado, o arquivo será recriado e toda a informação,
                se pré-existente, será excluída, recomeçando um arquivo um arquivo zerado.
             */
            PrintStream escrever = new PrintStream(new FileOutputStream("saida2.txt", true));

            for(int i = 0; i < 5; i++){
                System.out.println("Escreva algo:");
                String msg = sc.nextLine();
                escrever.println(msg);
            }
            escrever.close();
        }catch (FileNotFoundException e){
            System.out.println("Não foi possível criar o arquivo");
        }
        sc.close();
    }
}
