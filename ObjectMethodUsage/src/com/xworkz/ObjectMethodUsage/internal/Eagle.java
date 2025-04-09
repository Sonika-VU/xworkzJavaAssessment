package com.xworkz.ObjectMethodUsage.internal;

public class Eagle {
    private String  color;
    private int noOfEyes;
    private boolean canFly;

    public Eagle(String color, int noOfEyes, boolean canFly){
        System.out.println("String, int, boolean-arg const of Eagle");
        this.color = color;
        this.noOfEyes = noOfEyes;
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "color='" + color + '\'' +
                ", noOfEyes=" + noOfEyes +
                ", canFly=" + canFly +
                '}';
    }
}
