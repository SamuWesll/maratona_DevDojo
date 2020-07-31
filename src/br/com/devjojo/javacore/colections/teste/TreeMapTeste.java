package br.com.devjojo.javacore.colections.teste;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTeste {

    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "letra A");
        map.put("D", "letra D");
        map.put("C", "letra C");
        map.put("B", "letra B");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("--------------------");
        System.out.println(map.headMap("C", true));
    }

}
