package br.com.devjojo.javacore.jdbc.db;

import br.com.devjojo.javacore.jdbc.Entity.CompradorEntity;
import br.com.devjojo.javacore.jdbc.conn.ConexaoFectory;

import java.sql.*;
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
        String sql = "UPDATE PUBLIC.COMPRADOR SET NOME= ?, CPF= ? WHERE ID= ?;";
        Connection conn = ConexaoFectory.getConnection();
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,comprador.getNome());
            statement.setString(2,comprador.getCpf());
            statement.setInt(3,comprador.getId());
            statement.executeUpdate();
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
        String query = "SELECT * FROM COMPRADOR c WHERE c.NOME LIKE ?";
        Connection conn = ConexaoFectory.getConnection();
        List<CompradorEntity> listaComprador = new ArrayList<>();
        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1,"%" + name + "%");
            ResultSet rs = statement.executeQuery();
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

    public static List<CompradorEntity> findById(Integer id) {
        String sql = "SELECT * FROM COMPRADOR c WHERE id LIKE ?";
        Connection conn = ConexaoFectory.getConnection();
        List<CompradorEntity> list = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new CompradorEntity(rs.getInt("id"), rs.getString("nome"),rs.getString("cpf")));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void selectMetaData() {
        String query = "SELECT * FROM COMPRADOR c";
        Connection conn = ConexaoFectory.getConnection();
        try {
            Statement stnt = conn.createStatement();
            ResultSet rs = stnt.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            rs.next();
            int qtdColunas = rsmd.getColumnCount();
            System.out.println("Quantidade de colunas: " + qtdColunas);
            for (int i = 0; i <= qtdColunas; i++) {
                System.out.println(rsmd.getTableName(i));
//                System.out.println("Tabela: " + rsmd.getTableName(i));
//                System.out.println("Nome da coluna: " + rsmd.getColumnName(i));
//                System.out.println("Tamanho coluna: " + rsmd.getColumnDisplaySize(i));
            }
            ConexaoFectory.closed(conn, stnt, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void checkDriverStatus() {
        Connection conn = ConexaoFectory.getConnection();
        try {
            DatabaseMetaData metaData = conn.getMetaData();
            if (metaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                System.out.println("Suporta TYPE_FORWARD_ONLY");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
