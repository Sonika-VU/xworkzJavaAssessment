package com.xworkz.ObjectMethodUsage.internal;

public class Keyboard {
    private String brand;
    private boolean isWireless;
    private double price;

    public Keyboard(String brand, boolean isWireless, double price) {
        System.out.println("String, boolean, double-arg const of Keyboard");
        this.brand = brand;
        this.isWireless = isWireless;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "brand='" + brand + '\'' +
                ", isWireless=" + isWireless +
                ", price=" + price +
                '}';
    }
}
