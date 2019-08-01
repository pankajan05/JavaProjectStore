package com.company.ProjectRecord;

public class Factory {
    String type;

    public Factory(String type) {
        this.type = type;
    }


    public ProjectRecord factoryMethod(String id, String title, String clientId, int duration, int rate, int numberOfAllocatedResorces){
        if ("fixed".equals(this.type)){
            return  new FixedProjectRecord(id,title,clientId,duration,rate,numberOfAllocatedResorces);
        }else if ("variable".equals(this.type)){
            return  new VariableProjectRecord(id,title,clientId,duration,rate,numberOfAllocatedResorces);
        }
        return null;
    }
}
