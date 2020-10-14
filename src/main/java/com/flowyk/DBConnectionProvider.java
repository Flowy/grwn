package com.flowyk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionProvider {

    private Connection connection;
    String dbUrl = "jdbc:h2:mem:";

    public Connection get() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(dbUrl);
        }
        return connection;
    }
}
