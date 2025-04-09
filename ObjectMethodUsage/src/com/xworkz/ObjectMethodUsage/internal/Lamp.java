package com.xworkz.ObjectMethodUsage.internal;

public class Lamp {
    private String style;
    private double height;
    private boolean isLED;

    public Lamp(String style, double height, boolean isLED) {
        System.out.println("String, double, boolean-arg const of Lamp");
        this.style = style;
        this.height = height;
        this.isLED = isLED;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "style='" + style + '\'' +
                ", height=" + height +
                ", isLED=" + isLED +
                '}';
    }
}
