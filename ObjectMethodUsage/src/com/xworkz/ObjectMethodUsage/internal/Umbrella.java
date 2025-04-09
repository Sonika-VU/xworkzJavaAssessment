package com.xworkz.ObjectMethodUsage.internal;

public class Umbrella {
    private String size;
    private String color;
    private boolean isAutomatic;

    public Umbrella(String size, String color, boolean isAutomatic) {
        System.out.println("String, String, boolean-arg const of Umbrella");
        this.size = size;
        this.color = color;
        this.isAutomatic = isAutomatic;
    }

    @Override
    public String toString() {
        return "Umbrella{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", isAutomatic=" + isAutomatic +
                '}';
    }
}
