package com.xworkz.ObjectMethodUsage.internal;

public class Tile {
    private  String material;
    private int width;
    private boolean isBreakable;

    public  Tile(String material, int width, boolean isBreakable){
        System.out.println("String, int, boolean-arg const of Tile");
        this.material = material;
        this.width = width;
        this.isBreakable = isBreakable;
    }

    @Override
    public String toString() {
        return "Tile{" +
                "material='" + material + '\'' +
                ", width=" + width +
                ", isBreakable=" + isBreakable +
                '}';
    }
}
