package br.com.devjojo.javacore.io.teste;

import java.io.Console;

public class ConsoleTeste {

    public static void main(String[] args) {
        Console console = System.console();
        char[] pw = console.readPassword("%s", "pw: ");
        for(char p: pw) {
            console.format("%c", p);
        }
        console.format("\n");
        String texto;
        while (true) {
            texto = console.readLine("%s", "Digite: ");
            console.format("esse texto %s foi digitado ", retorno(texto));
        }
    }

    public static String retorno(String arg1) {
        return arg1;
    }

}
