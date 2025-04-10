package com.xworkz.ObjectMethodUsage.internal;

public class Poster {
    private  String size;
    private int cost;
    private boolean isColor;

    public Poster(String size, boolean isColor, int cost ){
        System.out.println("String, boolean, int const of Poster");
        this.size = size;
        this.isColor = isColor;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Poster{" +
                "size='" + size + '\'' +
                ", cost=" + cost +
                ", isColor=" + isColor +
                '}';
    }

    @Override
    public int hashCode() {
        return 436;
    }
}
