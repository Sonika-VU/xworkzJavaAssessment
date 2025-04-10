package com.xworkz.ObjectMethodUsage.internal;

public class Bucket {
    private int capacity;
    private String color;
    private double price;

    public Bucket(int capacity, String color, double price){
        System.out.println("int, String, double-arg const of Bucket");
        this.capacity = capacity;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "capacity=" + capacity +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return 89;
    }
}
