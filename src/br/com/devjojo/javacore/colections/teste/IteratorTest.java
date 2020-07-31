package br.com.devjojo.javacore.colections.teste;

import br.com.devjojo.javacore.colections.classes.ProdutoTwo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest {

    public static void main(String[] args) {
        List<ProdutoTwo> produtos = new LinkedList<>();
        ProdutoTwo produto1 = new ProdutoTwo(1, "Lapis", 5.90,10);
        ProdutoTwo produto2 = new ProdutoTwo(2, "caneta", 1.90,0);
        ProdutoTwo produto3 = new ProdutoTwo(3, "caderno", 15.90,30);
        ProdutoTwo produto4 = new ProdutoTwo(4, "corretivo", 3.90,0);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        Iterator<ProdutoTwo> produtosIterator = produtos.iterator();

        while (produtosIterator.hasNext()) {
            if (produtosIterator.next().getQuantidade() == 0) {
                produtosIterator.remove();
            }
        }
        System.out.println(produtos.size());
    }

}
