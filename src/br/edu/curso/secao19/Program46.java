package br.edu.curso.secao19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//Collections(Coleções)
/*
Listas
Arrays -> Um array tem um tamanho fixo. Ou seja, se criarmos um array com 5 elementos, ele poderá ter sempre
          no máximo 5 elementos.

          Um array tem um tipo de dado fixo. Ou seja, se criarmos um array de inteiros, ele só poderá ter
          inteiros.

          É difícil encontrar um elemento determinado em um array. Precisamos para isso varrer todo o array
          atráves do seu índice, caso não façamos a busca pelo índice.

Collections -> Java possui diversas classes/interfaces que facilitam muito o trabalho quando se trata de coleções de dados.
               Essas classes são chamadas de Collections(Coleções).

Listas -> Aceitam a repetição de valores
          Possuem um tamanho infinito (Depende da memória)
          Podemos adicionar valores de qualquer tipo
 */
public class Program46 {
    public static void main(String[] args) {
        //ArrayList nomes = new ArrayList(); -> Sem definir o tipo String
        ArrayList<String> nomes = new ArrayList<String>(); // -> Definindo o tipo String

        nomes.add("Gabriel");
        nomes.add("Geek");
        nomes.add("Felicity");
        nomes.add("José");

        //System.out.println(nome.get(0));
        //System.out.println(nome.get(3));

        System.out.println(nomes.size());

       /*
       for(int i=0; i < nomes.size(); i++){
           System.out.println(nomes.get(i));
        }
        */

        Collections.sort(nomes);

        for(Object nome : nomes){
            System.out.println(nome);
        }
    }
}
