package com.xworkz.ObjectMethodUsage.internal;

public class Gadget {
    private String brand;
    private String type;
    private double weight;

    public Gadget(String brand, String type, double weight) {
        System.out.println("String, String, double-arg const of Gadget");
        this.brand = brand;
        this.type = type;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Gadget{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}
