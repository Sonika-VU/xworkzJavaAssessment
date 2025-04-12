package com.xworkz.ObjectMethodUsage.internal;

public class Slipper {
    private String brand;
    private int size;
    private String material;

    public Slipper(String brand, int size, String material) {
        System.out.println("String, int, String-arg const of Slippers");
        this.brand = brand;
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Slipper{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 241;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Slipper) {
                System.out.println("Ref instanceOf Slipper");
                Slipper slipper1 = this;
                Slipper  slipper2 = (Slipper) obj;
                if (slipper2.brand == slipper1.brand && slipper2.size == slipper1.size && slipper2.material == slipper1.material) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
