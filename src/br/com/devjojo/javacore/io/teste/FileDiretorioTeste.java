package br.com.devjojo.javacore.io.teste;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTeste {

    public static void main(String[] args) throws IOException {
//        File diretorio = new File("folder");
//        boolean mkdir = diretorio.mkdir();
//        System.out.println("Diretorio Criado: " + mkdir);
//        File arquivo = new File(diretorio,"arquivo.txt");
//        boolean newFile = arquivo.createNewFile();
//        System.out.println("Arquivo criado: " + newFile);
//
//        File arquivoNovoNome = new File(diretorio,"arquivo_renomeado.txt");
//        arquivo.renameTo(arquivoNovoNome);
        bucarArquivo();
    }

    public static void bucarArquivo() {
        File file = new File("folder");
        String[] list = file.list();
        for(String arquivo: list) {
            System.out.println(arquivo);
        }
    }

}
