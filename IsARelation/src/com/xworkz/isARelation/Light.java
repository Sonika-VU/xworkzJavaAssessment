package com.xworkz.isARelation;

public class Light {
    public Light(){
        System.out.println("no-arg const of Light");
    }

    public void turnOn(){
        System.out.println("Running turnOn in Light");
    }

    public void turnOff(){
        System.out.println("Running turnOff in Light");
    }

    public void displayObject(){
        System.out.println("Running displayObject in Light");
    }

    public void decorate(){
        System.out.println("Running decorate in Light");
    }

    public void hangIt(){
        System.out.println("Running hangIt in Light");
    }
}
