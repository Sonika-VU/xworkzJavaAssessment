package com.xworkz.ObjectMethodUsage.internal;

public class Toothbrush {
    private String brand;
    private String color;
    private boolean isElectric;

    public Toothbrush(String brand, String color, boolean isElectric) {
        System.out.println("String, String, boolean-arg const of Toothbrush");
        this.brand = brand;
        this.color = color;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Toothbrush{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }
}
