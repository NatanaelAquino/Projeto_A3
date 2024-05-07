package main.java.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String url = "jdbc:mysql://localhost:3306/projeto1";
    private static final String user = "root";
    private static final String password = "q1w2e3";

    private static Connection conn;

    public static Connection getConnection() {

        try{
            if(conn == null){
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Conectado com sucesso!");
                return conn;
            } else{
                return conn;
            }
        } catch (SQLException e) {

                e.printStackTrace();
                return null;
            }
            
        }
};
