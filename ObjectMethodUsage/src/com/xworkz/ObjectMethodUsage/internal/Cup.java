package com.xworkz.ObjectMethodUsage.internal;

public class Cup {
    private String material;
    private double volume;
    private String color;

    public Cup(String material, double volume, String color) {
        System.out.println("String, double, String-arg const of Cup");
        this.material = material;
        this.volume = volume;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "material='" + material + '\'' +
                ", volume=" + volume +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return -943085;
    }
}
