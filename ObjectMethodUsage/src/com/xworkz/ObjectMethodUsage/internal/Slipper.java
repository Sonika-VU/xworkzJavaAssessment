package com.xworkz.ObjectMethodUsage.internal;

public class Slipper {
    private String brand;
    private int size;
    private String material;

    public Slipper(String brand, int size, String material) {
        System.out.println("String, int, String-arg const of Slippers");
        this.brand = brand;
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Slipper{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", material='" + material + '\'' +
                '}';
    }
}
