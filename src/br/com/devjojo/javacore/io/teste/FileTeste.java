package br.com.devjojo.javacore.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTeste {

    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            System.out.println(file.createNewFile());
            boolean exists = file.exists();
            System.out.println("Permissao para leitura: " + file.canRead());
            System.out.println("Path: " + file.getPath());
            System.out.println("path absoluto: " + file.getAbsolutePath());
            System.out.println("diretorio: " + file.isDirectory());
            System.out.println("hidden: " + file.isHidden());
            System.out.println("ultima modificacao: " + new Date(file.lastModified()));
            if (exists) {
                System.out.println("Deletador: " + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
