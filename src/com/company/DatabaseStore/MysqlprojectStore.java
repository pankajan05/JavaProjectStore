package com.company.DatabaseStore;

import com.company.ProjectRecord.Factory;
import com.company.ProjectRecord.ProjectRecord;
import com.company.connector.Connector;
import com.company.connector.MysqlConnector;

import java.sql.*;

public class MysqlprojectStore implements GetObject{

    public ProjectRecord getProjectRecord(String projectId) throws SQLException {
        String query = "SELECT * FROM PROJECT WHERE ID =" + projectId;

        Connector connector = new MysqlConnector();
        Connection conn = connector.connect();


        Statement s = conn.createStatement();
        ResultSet resultSet = s.executeQuery(query);

        while (resultSet.next()){

            Factory factory = new Factory( resultSet.getString("type"));
            ProjectRecord projectRecord = factory.factoryMethod(resultSet.getString("projectId"),
                    resultSet.getString("title"),resultSet.getString("clientId"),
                    resultSet.getInt("duration"),  resultSet.getInt("rate"),
                    resultSet.getInt("numberOfAllocatedResources"));

            return projectRecord;

        }
        return null;
    }

}
