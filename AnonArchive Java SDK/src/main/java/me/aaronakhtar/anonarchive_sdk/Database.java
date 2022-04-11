package me.aaronakhtar.anonarchive_sdk;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static final String
            MYSQL_HOST = "89.40.1.76",
            MYSQL_DATABASE = "anonarchive",
            MYSQL_USERNAME = "root",
            MYSQL_PASSWORD = "tsiroot123";

    private static final int MYSQL_PORT = 3306;

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
