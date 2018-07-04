package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCPostgreSQLE {

    //  Database credentials
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/firstDb";
    static final String USER = "postgres";
    static final String PASS = "";

    public Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager
                    .getConnection(DB_URL, USER, PASS);

        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
            return null;
        }

        if (connection != null) {
            System.out.println("You successfully connected to database now");
        } else {
            System.out.println("Failed to make connection to database");
        }


        return connection;
    }
}
