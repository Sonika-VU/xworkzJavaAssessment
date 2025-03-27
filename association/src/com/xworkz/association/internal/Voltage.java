package com.xworkz.association.internal;

public class Voltage {
    private int unit;

    public Voltage(){
        System.out.println("no-arg const of Voltage");
    }

    public void passElectricity(){
        System.out.println("\t\tRunning passElectricity in Voltage");
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getUnit() {
        return unit;
    }


}
