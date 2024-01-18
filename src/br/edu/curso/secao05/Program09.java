package br.edu.curso.secao05;

import java.util.Scanner;

//For
public class Program09 {
    public static void main(String[] args) {

        int year;
        String name;
        Scanner tec = new Scanner(System.in);

        //Variável de controle; condição de parada; forma de incremento
        //i++ -> i = i + 1
        for(int i = 0; i < 5; i++){
            System.out.println("Informe seu nome:");
            name = tec.nextLine();

            System.out.println("Informe sua idade:");
            year = Integer.parseInt(tec.nextLine());

            if(year > 0){
                System.out.println("Seu nome é: " + name + " e a sua idade é: " + year + " anos");
            }
        }
        tec.close();
    }
}
