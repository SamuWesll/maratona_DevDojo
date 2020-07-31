package br.com.devjojo.javacore.colections.teste;

import br.com.devjojo.javacore.colections.classes.Celular;
import br.com.devjojo.javacore.colections.classes.ProdutoTwo;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

//class CelularNomeComparator implements Comparator<Celular> {
//
//    @Override
//    public int compare(Celular o1, Celular o2) {
//        return o1.getNome().compareTo(o2.getNome());
//    }
//
//}

public class TreeSetTest {

    public static void main(String[] args) {

        ProdutoTwo produto1 = new ProdutoTwo(123,"notebook", 3000.99,10);
        ProdutoTwo produto2 = new ProdutoTwo(012,"cadeira de roda", 499.99,0);
        ProdutoTwo produto3 = new ProdutoTwo(43,"televisão LCD", 1200.50,20);
        ProdutoTwo produto4 = new ProdutoTwo(78,"microondas", 330.99,0);

        NavigableSet<ProdutoTwo> produtoNavigableSet = new TreeSet<>();

        produtoNavigableSet.add(produto1);
        produtoNavigableSet.add(produto2);
        produtoNavigableSet.add(produto3);
        produtoNavigableSet.add(produto4);

        for (ProdutoTwo prod : produtoNavigableSet.descendingSet()) {
            System.out.println(prod);
        }
        System.out.println("-------------------");
        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println(produtoNavigableSet.size());
//        System.out.println(produtoNavigableSet.pollFirst());
        System.out.println(produtoNavigableSet.pollLast());
        System.out.println(produtoNavigableSet.size());

//        Celular celular = new Celular("Celula", "12321132");
//        NavigableSet<Celular> celularNavigableSet = new TreeSet<>(new CelularNomeComparator());
//
//        celularNavigableSet.add(celular);
//        for (Celular cell : celularNavigableSet) {
//            System.out.println(cell);
//        }

    }

}
