package com.xworkz.ObjectMethodUsage.internal;

public class Microwave {
    private String brand;
    private double powerRating;
    private boolean hasGrill;

    public Microwave(String brand, double powerRating, boolean hasGrill) {
        System.out.println("String, double, boolean-arg const of Microwave");
        this.brand = brand;
        this.powerRating = powerRating;
        this.hasGrill = hasGrill;
    }

    @Override
    public String toString() {
        return "Microwave{" +
                "brand='" + brand + '\'' +
                ", powerRating=" + powerRating +
                ", hasGrill=" + hasGrill +
                '}';
    }
}
