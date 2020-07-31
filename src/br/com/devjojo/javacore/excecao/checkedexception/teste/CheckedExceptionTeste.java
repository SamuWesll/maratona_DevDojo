package br.com.devjojo.javacore.excecao.checkedexception.teste;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTeste {

    public static void main(String[] args) {
        criarArquivo();
    }

    public static void criarArquivo() {
        File file = new File("Teste.json");
        try {
            file.createNewFile();
            System.out.println("Arquivo criado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
