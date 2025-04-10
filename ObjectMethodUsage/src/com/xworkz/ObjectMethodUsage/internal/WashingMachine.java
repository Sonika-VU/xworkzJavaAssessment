package com.xworkz.ObjectMethodUsage.internal;

public class WashingMachine {
    private String brand;
    private int loadCapacityKG;
    private boolean isFrontLoad;

    public WashingMachine(String brand, int loadCapacityKG, boolean isFrontLoad) {
        System.out.println("String, int, boolean-arg const of WashingMachine");
        this.brand = brand;
        this.loadCapacityKG = loadCapacityKG;
        this.isFrontLoad = isFrontLoad;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "brand='" + brand + '\'' +
                ", loadCapacityKG=" + loadCapacityKG +
                ", isFrontLoad=" + isFrontLoad +
                '}';
    }

    @Override
    public int hashCode() {
        return 2355;
    }
}

