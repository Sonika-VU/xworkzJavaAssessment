package com.xworkz.ObjectMethodUsage.internal;

public class Bangle {
    private String material;
    private int size;
    private double cost;

    public Bangle(String material, int size, double cost){
        System.out.println("String, int, cost-arg const of Bangle");
        this.material = material;
        this.size = size;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Bangle{" +
                "material='" + material + '\'' +
                ", size=" + size +
                ", cost=" + cost +
                '}';
    }
}
