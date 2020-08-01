package br.com.devjojo.javacore.jdbc.teste;

import br.com.devjojo.javacore.jdbc.Entity.CompradorEntity;
import br.com.devjojo.javacore.jdbc.db.CompradorDB;

import java.util.List;

public class ConexaoTeste {

    public static void main(String[] args) {
//        inserir();
//        deletar();
//        alterar();
//        List<CompradorEntity> lista = queryAll();
        List<CompradorEntity> lista = queryByName("lice");
        System.out.println(lista);
    }

    public static void inserir() {
        CompradorEntity compradorEntity = new CompradorEntity("111.111.111-22","Alice");
        CompradorDB compradorDB = new CompradorDB();
        compradorDB.save(compradorEntity);
    }

    public static void deletar() {
        CompradorDB compradorDB = new CompradorDB();
        compradorDB.delete(2);
    }

    public static void alterar() {
        CompradorEntity compradorEntity = new CompradorEntity("124-456-789-10","Samuel");
        compradorEntity.setId(1);
        CompradorDB comprador = new CompradorDB();
        comprador.update(compradorEntity);
    }

    public static List<CompradorEntity> queryAll() {
        CompradorDB comprador = new CompradorDB();
        return comprador.selectAll();
    }

    public static List<CompradorEntity> queryByName(String name) {
        CompradorDB comprador = new CompradorDB();
        return comprador.searchByName(name);
    }

}
