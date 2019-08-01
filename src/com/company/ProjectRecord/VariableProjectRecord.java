package com.company.ProjectRecord;

public class VariableProjectRecord extends ProjectRecord{
    public VariableProjectRecord(String id, String title, String clientId, int duration, int rate, int numberOfAllocatedResorces) {
        super(id, title, clientId, duration, rate, numberOfAllocatedResorces);
    }

    public int calculateBill(){
        return this.duration * this.rate * this.numberOfAllocatedResorces;
    }
}
