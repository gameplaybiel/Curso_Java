package br.edu.curso.secao19;

import java.util.ArrayList;
import java.util.Collections;

//Listas
public class Program47 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(24);
        numbers.add(20);
        numbers.add(12);
        numbers.add(10);

        /*
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        */

        Collections.sort(numbers);

        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
    }
}
