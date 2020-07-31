package br.com.devjojo.javacore.colections.teste;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
        Map<String, String> map = new LinkedHashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.put("maz", "mais");
//        map.put("vc", "você");
        for (String key : map.values()){
            System.out.println(key);
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

}
