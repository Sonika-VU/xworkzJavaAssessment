package com.xworkz.ObjectMethodUsage.internal;

public class Sofa {
    private String material;
    private int seats;
    private String color;

    public Sofa(String material, int seats, String color) {
        System.out.println("String, int, String-arg const of Sofa");
        this.material = material;
        this.seats = seats;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "material='" + material + '\'' +
                ", seats=" + seats +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 35345;
    }
}
