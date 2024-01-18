package br.edu.curso.secao13;

//Template Method
/*
-> O padrão Template  Method define o esqueleto de um algoritmo dentro de um método, transferindo alguns
   de seus passos para as subclasses. O Template Method permite que as subclasses redefinam certos
   passos de um algoritmo sem alterar a estrutura do próprio algoritmo.

-> Algoritmos são as "receitas" passo a passo para resolver os problemas.

   Receber e retornar número

   método principal(){
      passo1();
      passo2();
      passo();
   }
*/

public class Program33 {
    public static void main(String[] args) {
        Treinamento tit = new TreinamentoInicio();

        tit.treinoDiario();

        Treinamento tft = new TreinamentoFinal();

        tft.treinoDiario();
    }
}
