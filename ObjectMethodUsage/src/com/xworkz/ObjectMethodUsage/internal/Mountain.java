package com.xworkz.ObjectMethodUsage.internal;

public class Mountain {
    private String name;
    private double height;
    private String location;

    public Mountain(String name, double height, String range) {
        System.out.println("String, double, String-arg const of Mountain");
        this.name = name;
        this.height = height;
        this.location = range;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", range='" + location + '\'' +
                '}';
    }
}
