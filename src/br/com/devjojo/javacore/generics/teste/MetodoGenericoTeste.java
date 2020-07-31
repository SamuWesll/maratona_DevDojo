package br.com.devjojo.javacore.generics.teste;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTeste {

    public static void main(String[] args) {
        List<Cachorro> cachorroList = criarArray(new Cachorro());
        for (Cachorro cao :  cachorroList) {
            System.out.println(cao.toString());
        }
    }

    public static <T> List<T> criarArray(T t) {
        List<T> lista = new ArrayList<>();
        lista.add(t);
//        System.out.println(lista);
        return lista;
    }

}
