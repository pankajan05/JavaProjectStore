package com.company.ProjectRecord;

public class FixedProjectRecord extends ProjectRecord {
    public FixedProjectRecord(String id, String title, String clientId, int duration, int rate, int numberOfAllocatedResorces) {
        super(id, title, clientId, duration, rate, numberOfAllocatedResorces);
    }

    public int calculateBill(){
        return this.duration * this.rate;
    }
}
