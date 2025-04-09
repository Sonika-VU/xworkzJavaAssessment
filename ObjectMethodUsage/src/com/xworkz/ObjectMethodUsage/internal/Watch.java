package com.xworkz.ObjectMethodUsage.internal;

public class Watch {
    private String brand;
    private String type;
    private boolean isSmart;

    public Watch(String brand, String type, boolean isSmart) {
        System.out.println("String, String, boolean-arg const of Watch");
        this.brand = brand;
        this.type = type;
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", isSmart=" + isSmart +
                '}';
    }
}
