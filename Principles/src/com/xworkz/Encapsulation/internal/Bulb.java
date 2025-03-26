package com.xworkz.Encapsulation.internal;

public class Bulb {
    private static final String volts;

    public Bulb(){
        System.out.println("no-arg const of Bulb");
    }

    public String getVolts(){
        return volts;
    }
    static {
        volts = "100W";
    }
}
