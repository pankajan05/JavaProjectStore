package com.company.DatabaseStore;

import com.company.ProjectRecord.ProjectRecord;

import java.sql.SQLException;

public interface GetObject {
    public ProjectRecord getProjectRecord(String projectId) throws SQLException;
}
