package com.xworkz.ObjectMethodUsage.internal;

public class Refrigerator {
    private String brand;
    private int capacity;
    private boolean hasFreezer;

    public Refrigerator(String brand, int capacity, boolean hasFreezer) {
        System.out.println("String, int, boolean-arg const of Refrigerator");
        this.brand = brand;
        this.capacity = capacity;
        this.hasFreezer = hasFreezer;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                ", hasFreezer=" + hasFreezer +
                '}';
    }

    @Override
    public int hashCode() {
        return 574;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Refrigerator) {
                System.out.println("Ref instanceOf Refrigerator");
                Refrigerator refrigerator1 = this;
                Refrigerator  refrigerator2 = (Refrigerator) obj;
                if (refrigerator1.hasFreezer == refrigerator2.hasFreezer && refrigerator1.brand == refrigerator2.brand && refrigerator1.capacity == refrigerator2.capacity) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

