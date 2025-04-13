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

    @Override
    public int hashCode() {
        return -98;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Bottle){
                System.out.println("Ref instanceOf Bottle ");
                Bottle bottle1 = this;
                Bottle bottle2 = (Bottle) obj;
                if(bottle1.capacity == bottle2.capacity ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
