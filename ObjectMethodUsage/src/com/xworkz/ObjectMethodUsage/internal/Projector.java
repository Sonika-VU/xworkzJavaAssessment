package com.xworkz.ObjectMethodUsage.internal;

public class Projector {
    private String company;
    private String color;
    private int price;

    public Projector(String company, String color, int price){
        System.out.println("String, String, int-arg const of Projector");
        this.company = company;
        this.color  = color;
        this. price =price;
    }

    @Override
    public String toString() {
        return "Projector{" +
                "company='" + company + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
