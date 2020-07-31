package br.com.devjojo.javacore.jdbc.teste;

import br.com.devjojo.javacore.jdbc.Entity.CompradorEntity;
import br.com.devjojo.javacore.jdbc.db.CompradorDB;

public class ConexaoTeste {

    public static void main(String[] args) {
        CompradorEntity compradorEntity = new CompradorEntity("123.456.789-10","Samuel Weslley");
        CompradorDB compradorDB = new CompradorDB();
        compradorDB.save(compradorEntity);
    }

}
