package br.com.devjojo.javacore.expressoesregulares.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTeste {

    public static void main(String[] args) {
        // \d - todos os digitos
        // \D - tudo que não for digitos
        // \s espaco em brancos \t \n \f \r
        // \S tudo que não é espaco em branco
        // \w caracteres de palavras a-z A-Z, digitos e _
        // \W tudo o que não for uma palavra
        //[]
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n ate m


        String regex = "\\W";
        String texto = "1asdasdas2asdasdsada34";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto:" + texto);
        System.out.println("Indice: 123456789");
        System.out.println("expressao: " + matcher.pattern());
        System.out.println("Posicoes encontradas" );
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }

    }

}
