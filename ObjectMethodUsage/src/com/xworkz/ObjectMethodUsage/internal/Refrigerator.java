package com.xworkz.ObjectMethodUsage.internal;

public class Refrigerator {
    private String brand;
    private int capacity;
    private boolean hasFreezer;

    public Refrigerator(String brand, int capacity, boolean hasFreezer) {
        System.out.println("String, int, boolean-arg const of Refrigerator");
        this.brand = brand;
        this.capacity = capacity;
        this.hasFreezer = hasFreezer;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                ", hasFreezer=" + hasFreezer +
                '}';
    }

    @Override
    public int hashCode() {
        return 574;
    }
}

