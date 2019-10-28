package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private Connection con;
    private static DatabaseConnection dbc;

    public DatabaseConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","");
            System.out.println("database connected");

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public Connection getConnection(){
        return con;
    }

    public static void main(String[] args) {
        new DatabaseConnection();
    }
}
