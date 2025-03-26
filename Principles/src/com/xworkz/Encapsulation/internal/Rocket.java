package com.xworkz.Encapsulation.internal;

public class Rocket {
    private static String fuelType;
    private static int fuelLevel;

    public Rocket(){
        System.out.println("no-arg const of Rocket");
    }

    void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }

    void setFuelLevel(int fuelLevel){
        this.fuelLevel = fuelLevel;
    }

    public String getFuelType(){
        return this.fuelType;
    }
    public int getFuelLevel(){
        return  this.fuelLevel;
    }
}
