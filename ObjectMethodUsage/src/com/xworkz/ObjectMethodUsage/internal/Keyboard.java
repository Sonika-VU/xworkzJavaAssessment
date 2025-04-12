package com.xworkz.ObjectMethodUsage.internal;

import java.security.Key;

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

    @Override
    public int hashCode() {
        return 392;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Keyboard) {
                System.out.println("Ref instanceOf Keyboard");
                Keyboard keyboard1 = this;
                Keyboard  keyboard2 = (Keyboard) obj;
                if (keyboard1.isWireless == keyboard2.isWireless && keyboard1.price == keyboard2.price) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
