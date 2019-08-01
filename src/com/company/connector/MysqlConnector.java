package com.company.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnector implements Connector {
    @Override
    public Connection connect() {
        String mysqlUserName = "admin";
        String mysqlPassword = "12345";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/track",mysqlUserName,mysqlPassword
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
