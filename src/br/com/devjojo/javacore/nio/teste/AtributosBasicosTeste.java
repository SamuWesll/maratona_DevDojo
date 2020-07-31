package br.com.devjojo.javacore.nio.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AtributosBasicosTeste {

    public static void main(String[] args) throws IOException {
        Date primeiroDeDezembro = new GregorianCalendar(2019, Calendar.DECEMBER, 1).getTime();
        File file = new File("folder\\arquivo.txt");
        file.createNewFile();
        file.setLastModified(primeiroDeDezembro.getTime());
        System.out.println(file.lastModified());
        file.delete();

        Path path = Paths.get("folder\\arquivo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.fromMillis(primeiroDeDezembro.getTime());
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.getLastModifiedTime(path));
        Files.deleteIfExists(path);

        BasicFileAttributes attributosBasicos = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println(attributosBasicos.creationTime());
        System.out.println(attributosBasicos.lastAccessTime());
        System.out.println(attributosBasicos.lastModifiedTime());
        System.out.println(attributosBasicos.isDirectory());
        System.out.println(attributosBasicos.isSymbolicLink());
        System.out.println(attributosBasicos.isRegularFile());
    }

}
