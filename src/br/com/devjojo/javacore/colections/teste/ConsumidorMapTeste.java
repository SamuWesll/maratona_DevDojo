package br.com.devjojo.javacore.colections.teste;

import br.com.devjojo.javacore.colections.classes.Consumidor;
import br.com.devjojo.javacore.colections.classes.ProdutoTwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTeste {

    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Samuel Weslley", "12322");
        Consumidor consumidor2 = new Consumidor("Empresa DevDojo", "1223123");

        ProdutoTwo produto1 = new ProdutoTwo(133,"Bala",0.30,100);
        ProdutoTwo produto2 = new ProdutoTwo(112,"Salgadinho",2.00,300);
        ProdutoTwo produto3 = new ProdutoTwo(54,"Chiclete",0.20,0);
        ProdutoTwo produto4 = new ProdutoTwo(98,"Valda",0.60,10);

        Map<Consumidor, List<ProdutoTwo>> map = new HashMap<>();

        List<ProdutoTwo> produtosCon1 = new ArrayList<>();
        produtosCon1.add(produto1);
        produtosCon1.add(produto2);
        List<ProdutoTwo> produtosCon2 = new ArrayList<>();
        produtosCon2.add(produto3);
        produtosCon2.add(produto4);

        map.put(consumidor, produtosCon1);
        map.put(consumidor2, produtosCon2);

        for (Map.Entry<Consumidor, List<ProdutoTwo>> entry : map.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (ProdutoTwo prod : entry.getValue()) {
                System.out.println(prod.getNome());
            }
        }

    }

}
