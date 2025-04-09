package com.xworkz.ObjectMethodUsage.internal;

public class Camera {
    private String brand;
    private int megapixel;
    private double price;

    public Camera(String brand, int megapixel, double price) {
        System.out.println("String, int, double-arg const of Camera");
        this.brand = brand;
        this.megapixel = megapixel;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "brand='" + brand + '\'' +
                ", megapixel=" + megapixel +
                ", price=" + price +
                '}';
    }
}
