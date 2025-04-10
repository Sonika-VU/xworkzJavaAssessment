package com.xworkz.ObjectMethodUsage.internal;

public class Table {
    private String shape;
    private String material;
    private int legs;

    public Table(String shape, String material, int legs) {
        System.out.println("String, String, int-arg const of Table");
        this.shape = shape;
        this.material = material;
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Table{" +
                "shape='" + shape + '\'' +
                ", material='" + material + '\'' +
                ", legs=" + legs +
                '}';
    }

    @Override
    public int hashCode() {
        return 123435;
    }
}
