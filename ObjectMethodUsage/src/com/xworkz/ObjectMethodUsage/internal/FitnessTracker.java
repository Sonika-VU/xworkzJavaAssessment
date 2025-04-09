package com.xworkz.ObjectMethodUsage.internal;

public class FitnessTracker {
    private String brand;
    private boolean waterResistant;
    private int batteryLifeHours;

    public FitnessTracker(String brand, boolean waterResistant, int batteryLifeHours) {
        System.out.println("String, boolean, int-arg const of FitnessTracker");
        this.brand = brand;
        this.waterResistant = waterResistant;
        this.batteryLifeHours = batteryLifeHours;
    }

    @Override
    public String toString() {
        return "FitnessTracker{" +
                "brand='" + brand + '\'' +
                ", waterResistant=" + waterResistant +
                ", batteryLifeHours=" + batteryLifeHours +
                '}';
    }
}
