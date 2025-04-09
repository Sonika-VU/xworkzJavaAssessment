package com.xworkz.ObjectMethodUsage.internal;

public class Curtain {
    private String fabric;
    private String color;
    private boolean isBlackout;

    public Curtain(String fabric, String color, boolean isBlackout) {
        System.out.println("String, String, boolean-arg const of Curtain");
        this.fabric = fabric;
        this.color = color;
        this.isBlackout = isBlackout;
    }

    @Override
    public String toString() {
        return "Curtain{" +
                "fabric='" + fabric + '\'' +
                ", color='" + color + '\'' +
                ", isBlackout=" + isBlackout +
                '}';
    }
}
