package com.xworkz.ObjectMethodUsage.internal;

public class Bike {
    private String brand;
    private int cc;
    private double mileage;

    public Bike(String brand, int cc, double mileage) {
        System.out.println("String, int, double-arg const of Bike");
        this.brand = brand;
        this.cc = cc;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + brand + '\'' +
                ", cc=" + cc +
                ", mileage=" + mileage +
                '}';
    }

    @Override
    public int hashCode() {
        return 930;
    }
}
