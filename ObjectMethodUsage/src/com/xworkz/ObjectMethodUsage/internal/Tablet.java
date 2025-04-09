package com.xworkz.ObjectMethodUsage.internal;

public class Tablet {
    private String brand;
    private int storageGB;
    private double screenSize;

    public Tablet(String brand, int storageGB, double screenSize) {
        System.out.println("String, int, double-arg const of Tablet");
        this.brand = brand;
        this.storageGB = storageGB;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "brand='" + brand + '\'' +
                ", storageGB=" + storageGB +
                ", screenSize=" + screenSize +
                '}';
    }
}
