package com.xworkz.ObjectMethodUsage.internal;

public class Speaker {
    private String brand;
    private int wattage;
    private boolean isBluetooth;

    public Speaker(String brand, int wattage, boolean isBluetooth) {
        System.out.println("String, int, boolean-arg const of Speaker");
        this.brand = brand;
        this.wattage = wattage;
        this.isBluetooth = isBluetooth;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "brand='" + brand + '\'' +
                ", wattage=" + wattage +
                ", isBluetooth=" + isBluetooth +
                '}';
    }

    @Override
    public int hashCode() {
        return 10000;
    }
}
