package br.com.devjojo.javacore.jdbc.db;

import br.com.devjojo.javacore.jdbc.Entity.CompradorEntity;
import br.com.devjojo.javacore.jdbc.conn.ConexaoFectory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

    public List<CompradorEntity> selectAll() {
        String query = "SELECT id, nome, cpf FROM PUBLIC .COMPRADOR";
        Connection conn = ConexaoFectory.getConnection();
        List<CompradorEntity> listaComprador = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                listaComprador.add(new CompradorEntity(rs.getInt("id"),rs.getString("nome"),rs.getString("cpf")));
            }
            ConexaoFectory.closed(conn, statement, rs);
            return listaComprador;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<CompradorEntity> searchByName(String name) {
        String query = "SELECT * FROM COMPRADOR c WHERE c.NOME LIKE '%" + name +"%'";
        Connection conn = ConexaoFectory.getConnection();
        List<CompradorEntity> listaComprador = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                listaComprador.add(new CompradorEntity(rs.getInt("id"),rs.getString("nome"),rs.getString("cpf")));
            }
            ConexaoFectory.closed(conn, statement, rs);
            return listaComprador;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}
