package br.com.devjojo.javacore.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoFectory {

    public static Connection getConnection() {
//        String url = "jdbc:h2:C:\\Users\\swbarboza\\Documents\\Projetos\\Projetos_Pessoais\\banco_de_dados\\agencia";
        String url = "jdbc:h2:C:/Users/swbarboza/Documents/Projetos/Projetos_Pessoais/banco_de_dados/agencia";
        String user = "root";
        String password = "root";
        try {
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void closed(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closed(Connection conn, Statement statement) {
        closed(conn);
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
