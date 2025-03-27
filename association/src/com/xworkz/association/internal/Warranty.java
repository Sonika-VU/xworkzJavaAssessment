package com.xworkz.association.internal;

public class Warranty {

    private String startDate;
    private String endDate;

    public void Warranty(){
        System.out.println("no-arg const of Warranty");
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}
