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

    @Override
    public int hashCode() {
        return 23;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Camera){
                System.out.println("Ref instanceOf Camera");
                Camera camera1 = this;
                Camera camera2 = (Camera) obj;
                if(camera1.megapixel == camera2.megapixel ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
