package br.edu.curso.secao16;

//Tratamento de erros
/*
numeros[0] -> i = 0 + 3 * 2 = 6
numeros[1] -> i = 1 + 3 * 2 = 7

-> Utilizamos try para tentar realizar algo, geralmente realizar aquilo que pode acarretar em um problema.
-> Utilizamos catch para capturar o erro e com isso oferecer ao usuário do sistema uma mensagem adequada sem que o sistema quebre.

*/
public class Program37 {
    public static void main(String[] args) {
        int numeros[] = new int[5]; //0,1,2,3,4 -> n-1

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i + 3 * 2;
        }

        for(int i = 0; i <= numeros.length; i++){
            try { //Tente fazer isso
                System.out.println(numeros[i]);
            }catch(ArrayIndexOutOfBoundsException ex){ //Exceção Não Checada
                System.out.println("Você está tentando acessar uma posição do array que não existe");
            } finally {
                System.out.println("Continua o processo...");
            }
        }
    }
}
