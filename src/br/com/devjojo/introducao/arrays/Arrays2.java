package br.com.devjojo.introducao.arrays;

public class Arrays2 {

    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Maria";
        nomes[1] = "Samuel";
        nomes[2] = "Alice";

        for (String nome: nomes) {
            System.out.println(nome);
        }
    }

}
