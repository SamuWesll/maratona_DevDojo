package br.com.devjojo.javacore.colections.teste;

import br.com.devjojo.javacore.colections.classes.Produto;

import java.util.*;

class ProdutoNomeComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getPreco().compareTo(o2.getPreco());
    }
}

public class SortProdutoTest {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto[] produtosArray = new Produto[4];

        Produto produto1 = new Produto(1l,"Laptop Lenovo", 2000.99);
        Produto produto2 = new Produto(2l,"Laptop Lenovo Max", 3000.50);
        Produto produto3 = new Produto(3l,"Celular Motorola G3", 999.00);
        Produto produto4 = new Produto(4l,"Celular Mi Phone", 699.00);

        produtosArray[0] = produto1;
        produtosArray[1] = produto2;
        produtosArray[2] = produto3;
        produtosArray[3] = produto4;

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        Collections.sort(produtos, new ProdutoNomeComparator());
//        for (Produto prod : produtos) {
//            System.out.println(prod);
//        }

        Arrays.sort(produtosArray, new ProdutoNomeComparator());
        System.out.println(Arrays.toString(produtosArray));

    }

}
