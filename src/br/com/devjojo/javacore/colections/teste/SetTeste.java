package br.com.devjojo.javacore.colections.teste;

import br.com.devjojo.javacore.colections.classes.ProdutoTwo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTeste {

    public static void main(String[] args) {
        ProdutoTwo produto1 = new ProdutoTwo(1, "Lapis", 5.90,10);
        ProdutoTwo produto2 = new ProdutoTwo(2, "caneta", 1.90,0);
        ProdutoTwo produto3 = new ProdutoTwo(3, "caderno", 15.90,30);
        ProdutoTwo produto4 = new ProdutoTwo(4, "corretivo", 3.90,0);
//        Set<ProdutoTwo> produtosSet = new HashSet<>();
        Set<ProdutoTwo> produtosSet = new LinkedHashSet<>();

        produtosSet.add(produto1);
        produtosSet.add(produto2);
        produtosSet.add(produto3);
        produtosSet.add(produto4);

        for (ProdutoTwo prod : produtosSet) {
            System.out.println(prod);
        }
    }

}
