package br.com.devjojo.javacore.colections.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaoDeListaArraysTeste {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(5);
        numeros.add(7);
        numeros.add(9);
        Integer[] numerosArrays = new Integer[numeros.size()];
        numeros.toArray(numerosArrays);
        System.out.println("Convertendo de lista para array");
        System.out.println(numeros);
        System.out.println(Arrays.toString(numerosArrays));
        System.out.println("--------------------------");
        System.out.println("Convertendo de array para lista");

        Integer[] numeroArray2 = new Integer[4];
        numeroArray2[0] = 10;
        numeroArray2[1] = 9;
        numeroArray2[2] = 8;
        numeroArray2[3] = 7;
        List<Integer> numero2 = Arrays.asList(numeroArray2);
        System.out.println(Arrays.toString(numeroArray2));
        System.out.println(numero2);
    }

}
