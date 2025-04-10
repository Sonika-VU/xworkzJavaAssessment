package com.xworkz.ObjectMethodUsage.internal;

public class Board {
    private String color;
    private int height;
    private  int width;

    public Board(String color, int height, int width){
        System.out.println("String, int, int -arg const of Board");
        this.color = color;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Board{" +
                "color='" + color + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public int hashCode() {
        return -12;
    }
}
