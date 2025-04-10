package com.xworkz.ObjectMethodUsage.internal;

public class LipStick {
    private String brand;
    private String color;
    private int price;

    public LipStick(String brand, String color, int price){
        System.out.println("String, String, int-arg const of LipStick");
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LipStick{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return 5688;
    }
}
