package com.xworkz.ObjectMethodUsage.internal;

public class Cloth {
    private  String material;
    private String color;
    private int length;

    public Cloth(String material, String color, int length){
        System.out.println("String, String, int arg const of Cloth");
        this.material = material;
        this.color = color;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", length=" + length +
                '}';
    }
}
