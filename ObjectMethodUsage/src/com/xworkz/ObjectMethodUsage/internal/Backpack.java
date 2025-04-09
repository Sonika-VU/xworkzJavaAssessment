package com.xworkz.ObjectMethodUsage.internal;

public class Backpack {
    private String brand;
    private int compartments;
    private boolean hasLaptopSection;

    public Backpack(String brand, int compartments, boolean hasLaptopSection) {
        System.out.println("String, int, boolean-arg const of Backpack");
        this.brand = brand;
        this.compartments = compartments;
        this.hasLaptopSection = hasLaptopSection;
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "brand='" + brand + '\'' +
                ", compartments=" + compartments +
                ", hasLaptopSection=" + hasLaptopSection +
                '}';
    }
}
