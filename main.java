package com.company.track;




import java.sql.SQLException;

public class main {

    public static void main(String[] args) {
        String arg0 = args[0]; //projectid
        MysqlprojectStore mysqlprojectStore = new MysqlprojectStore();
        int cost = 0;
        try {
            ProjectRecord projectRecord = mysqlprojectStore.get(arg0);
            if ("fixed".equals(projectRecord.type)){
                cost = calculateBillForFixedCostProject(projectRecord)
            }else if ("variable".equals(projectRecord.type)){
                cost = calculateBillForVariableConstProject(projectRecord);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        System.out.println("The cost of the project " + arg0 + " is" + cost);

    }

    private static int calculateBillForFixedCostProject(ProjectRecord projectRecord){
        return projectRecord.duration * projectRecord.rate;
    }

    private static int calculateBillForVariableConstProject(ProjectRecord projectRecord){
        return projectRecord.duration * projectRecord.rate * projectRecord.numberOfAllocatedResources;
    }


}
