package com.xworkz.ObjectMethodUsage.internal;

public class Map {
    private String country;
    private int length;
    private boolean isColored;

    public Map(String country, int length, boolean isColored){
        System.out.println("String, int, boolean-arg const of Map");
        this.country = country;
        this.length = length;
        this.isColored = isColored;
    }

    @Override
    public String toString() {
        return "Map{" +
                "country='" + country + '\'' +
                ", length=" + length +
                ", isColored=" + isColored +
                '}';
    }

    @Override
    public int hashCode() {
        return -78790;
    }
}
