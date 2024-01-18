package br.edu.curso.secao18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Lendo em arquivos
public class Program44 {
    public static void main(String[] args) {

        try{
            Scanner sc = new Scanner(new FileInputStream("entrada.txt"));

            while (sc.hasNextLine()){
                String linha = sc.nextLine();
                System.out.println(linha);
            }
            sc.close();

        }catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }
    }
}
