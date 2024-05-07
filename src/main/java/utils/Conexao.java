package main.java.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static final String url = "jdbc:mysql://localhost:3306/sistemas";
    private static final String user = "root";
    private static final String password = "Natan@2021"; // Corrigido o nome da variável

    private static Connection conn;

    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) { // Adicionado o teste para verificar se a conexão está fechada
                conn = DriverManager.getConnection(url, user, password);
            }
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

