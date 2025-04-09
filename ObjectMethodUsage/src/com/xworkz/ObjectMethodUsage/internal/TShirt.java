package com.xworkz.ObjectMethodUsage.internal;

public class TShirt {
    private String size;
    private String color;
    private int price;

    public TShirt(String size, String color, int price){
        System.out.println("String, String, int -arg const of TShirt");
        this.size = size;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
