package com.xworkz.ObjectMethodUsage.internal;

public class Toothbrush {
    private String brand;
    private String color;
    private boolean isElectric;

    public Toothbrush(String brand, String color, boolean isElectric) {
        System.out.println("String, String, boolean-arg const of Toothbrush");
        this.brand = brand;
        this.color = color;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Toothbrush{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }

    @Override
    public int hashCode() {
        return 893;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Toothbrush) {
                System.out.println("Ref instanceOf Toothbrush");
                Toothbrush toothbrush1 = this;
                Toothbrush  toothbrush2 = (Toothbrush) obj;
                if (toothbrush2.isElectric == toothbrush1.isElectric && toothbrush2.brand == toothbrush1.brand && toothbrush2.color == toothbrush1.color) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
