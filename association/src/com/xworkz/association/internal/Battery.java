package com.xworkz.association.internal;

public class Battery {
    private int volt;
    private int cost;

    public void convertEnergy(){
        System.out.println("\tRunning convertEnergy in Battery");
    }

    public Battery(){
        System.out.println("no-arg const of Battery");
    }

    public void setVolt(int volt) {
        this.volt = volt;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getVolt() {
        return volt;
    }

    public int getCost() {
        return cost;
    }
}
