package com.xworkz.Encapsulation.internal;

public class Nasa {
    Rocket rocket = new Rocket();

    public Nasa(){
        System.out.println("no-arg const of Nasa");
    }

    public void manufactureRocket(){
        System.out.println("Running manufactureRocket in Nasa");
        rocket.setFuelType("Methane");
        rocket.setFuelLevel(500);
        System.out.println("Fuel type : "+rocket.getFuelType());
        System.out.println("Fuel Level : "+rocket.getFuelLevel());
    }
}
