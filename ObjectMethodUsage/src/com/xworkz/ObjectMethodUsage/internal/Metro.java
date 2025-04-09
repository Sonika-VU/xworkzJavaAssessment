package com.xworkz.ObjectMethodUsage.internal;

public class Metro {
    private  String location;
    private int noOfSeats;
    private  int price;

    public Metro(String location, int noOfSeats, int price){
        System.out.println("String, int, int-arg const of Metro");
        this.location = location;
        this.noOfSeats = noOfSeats;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Metro{" +
                "location='" + location + '\'' +
                ", noOfSeats=" + noOfSeats +
                ", price=" + price +
                '}';
    }
}
