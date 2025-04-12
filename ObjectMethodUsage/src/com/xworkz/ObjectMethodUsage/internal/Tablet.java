package com.xworkz.ObjectMethodUsage.internal;

public class Tablet {
    private String brand;
    private int storageGB;
    private double screenSize;

    public Tablet(String brand, int storageGB, double screenSize) {
        System.out.println("String, int, double-arg const of Tablet");
        this.brand = brand;
        this.storageGB = storageGB;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "brand='" + brand + '\'' +
                ", storageGB=" + storageGB +
                ", screenSize=" + screenSize +
                '}';
    }

    @Override
    public int hashCode() {
        return -1232;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Tablet) {
                System.out.println("Ref instanceOf Tablet");
                Tablet tablet1 = this;
                Tablet tablet2  = (Tablet) obj;
                if (tablet2.brand == tablet1.brand && tablet2.screenSize == tablet1.screenSize && tablet2.storageGB == tablet1.storageGB) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
