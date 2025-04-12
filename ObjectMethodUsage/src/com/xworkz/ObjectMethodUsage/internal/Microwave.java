package com.xworkz.ObjectMethodUsage.internal;

public class Microwave {
    private String brand;
    private double powerRating;
    private boolean hasGrill;

    public Microwave(String brand, double powerRating, boolean hasGrill) {
        System.out.println("String, double, boolean-arg const of Microwave");
        this.brand = brand;
        this.powerRating = powerRating;
        this.hasGrill = hasGrill;
    }

    @Override
    public String toString() {
        return "Microwave{" +
                "brand='" + brand + '\'' +
                ", powerRating=" + powerRating +
                ", hasGrill=" + hasGrill +
                '}';
    }

    @Override
    public int hashCode() {
        return -80;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Microwave) {
                System.out.println("Ref instanceOf Microwave");
                Microwave microwave1 = this;
                Microwave  microwave2 = (Microwave) obj;
                if ( microwave1.powerRating == microwave2.powerRating && microwave1.hasGrill == microwave2.hasGrill) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
