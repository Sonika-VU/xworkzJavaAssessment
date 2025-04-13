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

    @Override
    public int hashCode() {
        return 389;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Bag){
                System.out.println("Ref instanceOf Bag");
                Bag bag1 = this;
                Bag bag2 = (Bag) obj;
                if(bag1.brand == bag2.brand ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
