package com.xworkz.association.internal;

public class Battery {
    private int volt;
    private int cost;
    private Voltage voltage;

    public Battery(Voltage voltage){
        System.out.println("no-arg const of Battery");
        this.voltage = voltage;
    }

    public void convertEnergy(){
        System.out.println("\tRunning convertEnergy in Battery");
        if(voltage != null){
            System.out.println("\t   Voltage");
            voltage.setUnit(100);
            System.out.println("\t\tUnits : "+voltage.getUnit());
        }
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
