package com.company;




import com.company.DatabaseStore.GetObject;
import com.company.DatabaseStore.MysqlprojectStore;
import com.company.ProjectRecord.ProjectRecord;

import java.sql.SQLException;

public class main {

    public static void main(String[] args) {
        String projectId = args[0];


        GetObject getObject = new MysqlprojectStore();


        int cost = 0;
        try {
            ProjectRecord projectRecord = getObject.getProjectRecord(projectId);

                cost = projectRecord.calculateBill();
        }catch (SQLException e){
            e.printStackTrace();
        }

        System.out.println("The cost of the project " + projectId + " is" + cost);

    }






}
