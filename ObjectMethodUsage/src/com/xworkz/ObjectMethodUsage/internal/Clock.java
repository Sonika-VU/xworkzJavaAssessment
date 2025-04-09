package com.xworkz.ObjectMethodUsage.internal;

public class Clock {
    private String type;
    private boolean isDigital;
    private String brand;

    public Clock(String type, boolean isDigital, String brand) {
        System.out.println("String, boolean, String-arg const of Clock");
        this.type = type;
        this.isDigital = isDigital;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "type='" + type + '\'' +
                ", isDigital=" + isDigital +
                ", brand='" + brand + '\'' +
                '}';
    }
}
