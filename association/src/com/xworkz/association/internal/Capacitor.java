package com.xworkz.association.internal;

public class Capacitor {
    private int volts;

    public Capacitor(){
        System.out.println("no-arg const of Capacitor");
    }

    public void storeEnergy(){
        System.out.println("\tRunning storeEnergy in Capacitor");
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }

    public int getVolts() {
        return volts;
    }
}
