package com.xworkz.ObjectMethodUsage.internal;

public class Shoe {
    private String brand;
    private int size;
    private String color;

    public Shoe(String brand, int size, String color) {
        System.out.println("String, int, String-arg const of Shoes");
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 675908;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Shoe) {
                System.out.println("Ref instanceOf Shoe");
                Shoe shoe1 = this;
                Shoe  shoe2 = (Shoe) obj;
                if (shoe1.brand == shoe2.brand && shoe1.color == shoe2.brand && shoe1.size == shoe2.size) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
