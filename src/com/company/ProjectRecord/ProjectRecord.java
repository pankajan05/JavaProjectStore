package com.company.ProjectRecord;

public abstract class ProjectRecord {


    String id;
    String title;
    String clientId;
    int duration;
    int rate;
    int numberOfAllocatedResorces;


    public ProjectRecord(String id, String title, String clientId, int duration, int rate, int numberOfAllocatedResorces) {

        this.id = id;
        this.title = title;
        this.clientId = clientId;
        this.duration = duration;
        this.rate = rate;
        this.numberOfAllocatedResorces = numberOfAllocatedResorces;

    }

    public abstract int calculateBill();
}
