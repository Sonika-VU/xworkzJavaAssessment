package com.xworkz.ObjectMethodUsage.internal;

public class Rocket {
    private String name;
    private double fuelCapacity;
    private boolean isReusable;

    public Rocket(String name, double fuelCapacity, boolean isReusable) {
        System.out.println("String, double, boolean-arg const of Rocket");
        this.name = name;
        this.fuelCapacity = fuelCapacity;
        this.isReusable = isReusable;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "name='" + name + '\'' +
                ", fuelCapacity=" + fuelCapacity +
                ", isReusable=" + isReusable +
                '}';
    }
}
