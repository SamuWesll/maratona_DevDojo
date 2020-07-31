package br.com.devjojo.javacore.string.teste;

public class StringTeste {

    public static void main(String[] args) {
        String nome = "Samuel";
        nome.concat(" Weslley");

        String teste = "Goku";
        String teste2 = "abcdef";
        String teste3 = "      2131123213213    ";

        System.out.println(teste.charAt(3));
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(teste.length());
        System.out.println(teste2.replace('a', 'o'));
        System.out.println(teste2.toLowerCase());
        System.out.println(teste2.toUpperCase());
        System.out.println(teste3.trim());

    }

}
