package com.xworkz.ObjectMethodUsage.internal;

public class Helmet {
    private String type;
    private String color;
    private boolean isFullFace;

    public Helmet(String type, String color, boolean isFullFace) {
        System.out.println("String, String, boolean-arg const of Helmet");
        this.type = type;
        this.color = color;
        this.isFullFace = isFullFace;
    }

    @Override
    public String toString() {
        return "Helmet{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", isFullFace=" + isFullFace +
                '}';
    }

    @Override
    public int hashCode() {
        return -4536;
    }
}
