package com.xworkz.ObjectMethodUsage.internal;

public class Gold {
    private String ornamentType;
    private int weight;
    private double price;

    public Gold(String ornamentType, int weight, double price){
        System.out.println("String, int double-arg of Gold");
        this.ornamentType = ornamentType;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Gold{" +
                "ornamentType='" + ornamentType + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
