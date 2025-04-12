package com.xworkz.ObjectMethodUsage.internal;

public class Rocket {
    private String name;
    private double fuelCapacity;
    private boolean isReusable;

    public Rocket(String name, double fuelCapacity, boolean isReusable) {
        System.out.println("String, double, boolean-arg const of Rocket");
        this.name = name;
        this.fuelCapacity = fuelCapacity;
        this.isReusable = isReusable;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "name='" + name + '\'' +
                ", fuelCapacity=" + fuelCapacity +
                ", isReusable=" + isReusable +
                '}';
    }

    @Override
    public int hashCode() {
        return 90498;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Rocket) {
                System.out.println("Ref instanceOf Rocket");
                Rocket rocket1 = this;
                Rocket  rocket2 = (Rocket) obj;
                if (rocket2.isReusable == rocket1.isReusable && rocket2.name == rocket1.name && rocket2.fuelCapacity == rocket1.fuelCapacity) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
