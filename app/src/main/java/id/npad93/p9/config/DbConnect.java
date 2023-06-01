package id.npad93.p9.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnect {
    private static final String DB_URL = "jdbc:sqlite:login";
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    public static void Connection() {
        try {
            connection = DriverManager.getConnection(DB_URL);
            System.out.prinln("Database Connected");
        }cath (SQLException e) {
            e.printStackTrace();
        }
    } <- #16-23 public static void connection()
} <- #9-24 public class DbConnect
