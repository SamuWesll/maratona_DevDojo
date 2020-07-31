package br.com.devjojo.javacore.colections.teste;

import br.com.devjojo.javacore.colections.classes.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(5);
        numeros.add(9);
        numeros.add(4);
        numeros.add(12);
        numeros.add(20);
        numeros.add(50);
        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros, 50));

        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto(1l,"Laptop Lenovo", 2000.99);
        Produto produto2 = new Produto(2l,"Laptop Lenovo Max", 3000.50);
        Produto produto3 = new Produto(3l,"Celular Motorola G3", 999.00);
        Produto produto4 = new Produto(4l,"Celular Mi Phone", 699.00);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        Collections.sort(produtos, new ProdutoNomeComparator());
        Produto produto5 = new Produto(0l, "antena",50d);
        System.out.println(Collections.binarySearch(produtos, produto5, new ProdutoNomeComparator()));
        for (Produto prod : produtos) {
            System.out.println(prod);
        }
    }

}
