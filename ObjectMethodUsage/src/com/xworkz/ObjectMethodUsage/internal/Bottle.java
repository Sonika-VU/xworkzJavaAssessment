package com.xworkz.ObjectMethodUsage.internal;

public class Bottle {
    private String company;
    private int capacity;
    private double price;

    public Bottle(String company, int capacity, double price){
        System.out.println("String, int, double-arg const of Bottle");
        this.company = company ;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "company='" + company + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
}
