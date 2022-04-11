package me.aaronakhtar.anonarchive_sdk;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static final String
            MYSQL_HOST = "YOUR-SQL-SERVER-IP",
            MYSQL_DATABASE = "anonarchive",
            MYSQL_USERNAME = "root",
            MYSQL_PASSWORD = "PASSWORD";

    private static final int MYSQL_PORT = YOURPORT;

    public static Connection getMainDatabase() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection
                ("jdbc:mysql://"+ MYSQL_HOST + ":"+MYSQL_PORT+"/"
                                + MYSQL_DATABASE,
                        MYSQL_USERNAME,
                        MYSQL_PASSWORD);
        return connection;
    }


}
