package br.com.devjojo.javacore.colections.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();
        List<String> nomes2 = new ArrayList<String>();
        nomes.add("Samuel");
        nomes.add("Alice");
        nomes2.add("Samuel2");
        nomes2.add("Alice2");
        nomes.addAll(nomes2);


        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

}
