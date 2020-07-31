package br.com.devjojo.javacore.nio.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CriandoPathTest {

    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\swbarboza\\Documents\\Projetos\\Referencias_e_Exemplos\\Java\\MaratonaDevDojo\\Arquivo.txt");
        Path p2 = Paths.get("C:\\Users\\swbarboza\\Documents\\Projetos\\Referencias_e_Exemplos\\Java\\MaratonaDevDojo", "Arquivo.txt");
        Path p3 = Paths.get("C:","Users\\swbarboza\\Documents\\Projetos\\Referencias_e_Exemplos\\Java\\MaratonaDevDojo", "Arquivo.txt");
        Path p4 = Paths.get("C:","Users","swbarboza","Documents","Projetos","Referencias_e_Exemplos","Java","MaratonaDevDojo", "Arquivo.txt");

        System.out.println(p4.toAbsolutePath());
        File file = p4.toFile();
        Path path = file.toPath();

        Path path1 = Paths.get("pasta");
        Path path2 = Paths.get("pasta\\subpasta\\subsubpasta");
        Path arquivo = Paths.get("pasta\\subpasta\\subsubpasta\\file.txt");
        try {
//            if (Files.notExists(path1))
//                Files.createDirectories(path1);
            if (Files.notExists(path2))
                Files.createDirectories(path2);
            if (Files.notExists(arquivo))
                Files.createFile(arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path source = Paths.get("folder\\arquivo.txt");
        Path target = Paths.get(path2.toString() + "\\arquivoCopiado.txt");

        try {
            Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
