package com.xworkz.ObjectMethodUsage.internal;

public class Bag {
    private String brand;
    private String color;
    private double price;

    public Bag(String brand, String color, double price){
        System.out.println("String, String, double-arg const of Bag");
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
