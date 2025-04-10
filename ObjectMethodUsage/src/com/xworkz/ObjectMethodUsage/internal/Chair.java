package com.xworkz.ObjectMethodUsage.internal;

public class Chair {
    private  String material;
    private String color;
    private double price;

    public Chair(String material, String color, double price){
        System.out.println("String, String, double-arg const of Chair");
    }

    @Override
    public String toString() {
        return "Chair{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public int hashCode() {
        return -45;
    }
}
