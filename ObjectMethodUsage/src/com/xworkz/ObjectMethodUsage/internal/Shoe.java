package com.xworkz.ObjectMethodUsage.internal;

public class Shoe {
    private String brand;
    private int size;
    private String color;

    public Shoe(String brand, int size, String color) {
        System.out.println("String, int, String-arg const of Shoes");
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
