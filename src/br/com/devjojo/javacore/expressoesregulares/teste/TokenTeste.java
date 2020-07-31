package br.com.devjojo.javacore.expressoesregulares.teste;

public class TokenTeste {

    public static void main(String[] args) {
        String str = "Samuel, Alice, Railda, Valmir, Wendy, Filipe, Teo";
        String[] tokens = str.split(",");
        for (String arr: tokens) {
            System.out.println(arr.trim());
        }
    }

}
