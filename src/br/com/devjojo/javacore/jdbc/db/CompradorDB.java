package br.com.devjojo.javacore.jdbc.db;

import br.com.devjojo.javacore.jdbc.Entity.CompradorEntity;
import br.com.devjojo.javacore.jdbc.conn.ConexaoFectory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CompradorDB {

    public void save(CompradorEntity comprador) {
        String sql = "INSERT INTO PUBLIC.COMPRADOR (CPF,NOME) VALUES ('" + comprador.getCpf() + "','"+ comprador.getNome() +"');";
        Connection conn = ConexaoFectory.getConnection();
        try {
            Statement statement = conn.createStatement();
            System.out.println(statement.executeUpdate(sql));
            ConexaoFectory.closed(conn, statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
