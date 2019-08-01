package com.company.track;

import java.sql.*;

public enum MysqlprojectStore {

    public ProjectRecord get(String projId) throws SQLException {
        String query = "SELECT * FROM PROJECT WHERE ID =" + projId;

        String mysqlUserName = "admin";
        String mysqlPassword = "12345";
        Connection conn = DriverManager.getConnection(
                "//enter url"
        );

        Statement s = conn.createStatement();
        ResultSet resultSet = s.executeQuery(query);

        while (resultSet.next()){
            ProjectRecord projectRecord = new ProjectRecord();
            projectRecord.id = resultSet.getString("projectId");
            projectRecord.title = resultSet.getString("title");
            projectRecord.clientId = resultSet.getString("clientId");
            projectRecord.duration = resultSet.getInt("duration");
            projectRecord.rate = resultSet.getInt("rate");
            projectRecord.numberOfAllocatedResorces = resultSet.getInt("numberOfAllocatedResources");
            projectRecord.type = resultSet.getString("type");
            return projectRecord;

        }
        return null;
    }

}
