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
            statement.executeUpdate(sql);
            ConexaoFectory.closed(conn, statement);
            System.out.println("Registro cadastrado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Integer id) {
        if (id == null) {
            System.out.println("comprador informado é não valido!");
            return;
        }
        String sql = "DELETE FROM PUBLIC.COMPRADOR\n" + "\tWHERE ID='" + id +"'";
        Connection conn = ConexaoFectory.getConnection();
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
            ConexaoFectory.closed(conn, statement);
            System.out.println("Registro excluido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(CompradorEntity comprador) {
        if (comprador.getId() == null) {
            System.out.println("comprador informado é não valido!");
            return;
        }
        String sql = "UPDATE PUBLIC.COMPRADOR SET NOME='"+ comprador.getNome() +"',CPF='"+ comprador.getCpf() + "' WHERE ID="+ comprador.getId() + ";";
        Connection conn = ConexaoFectory.getConnection();
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
            ConexaoFectory.closed(conn, statement);
            System.out.println("Registro alterado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
