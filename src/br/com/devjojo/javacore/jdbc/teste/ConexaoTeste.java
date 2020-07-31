package br.com.devjojo.javacore.jdbc.teste;

import br.com.devjojo.javacore.jdbc.Entity.CompradorEntity;
import br.com.devjojo.javacore.jdbc.db.CompradorDB;

public class ConexaoTeste {

    public static void main(String[] args) {
//        inserir();
//        deletar();
        alterar();
    }

    public static void inserir() {
        CompradorEntity compradorEntity = new CompradorEntity("123.456.789-10","Samuel Weslley");
        CompradorDB compradorDB = new CompradorDB();
        compradorDB.save(compradorEntity);
    }

    public static void deletar() {
        CompradorDB compradorDB = new CompradorDB();
        compradorDB.delete(2);
    }

    public static void alterar() {
        CompradorEntity compradorEntity = new CompradorEntity("124-456-789-10","Samuel Weslley");
        compradorEntity.setId(1);
        CompradorDB comprador = new CompradorDB();
        comprador.update(compradorEntity);
    }

}
