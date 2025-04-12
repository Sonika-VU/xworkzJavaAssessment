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

    @Override
    public int hashCode() {
        return 2341;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Tile) {
                System.out.println("Ref instanceOf Tile");
                Tile tile1 = this;
                Tile  tile2 = (Tile) obj;
                if (tile2.isBreakable == tile1.isBreakable && tile2.width == tile1.width && tile2.material == tile1.material) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
