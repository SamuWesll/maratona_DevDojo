package br.com.devjojo.javacore.colections.teste;

import br.com.devjojo.javacore.colections.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTeste {

    public static void main(String[] args) {
        Celular celular = new Celular("Mi 8 Lite", "123456");
        Celular celular2 = new Celular("Mi 9", "678901");
        Celular celular3 = new Celular("Iphone 6", "1234321");

        List<Celular> celulares = new ArrayList<>();
        celulares.add(celular);
        celulares.add(celular2);
        celulares.add(celular3);

        for (Celular cell : celulares) {
            System.out.println(cell);
        }
        Celular celular4 = new Celular("Iphone 6", "1234321");
        System.out.println(celulares.contains(celular4) ? "contem celular na lista" : "não contem o celular na lista");

    }

}
