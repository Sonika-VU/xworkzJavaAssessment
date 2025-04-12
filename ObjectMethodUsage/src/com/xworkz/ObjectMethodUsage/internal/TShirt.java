package com.xworkz.ObjectMethodUsage.internal;

public class TShirt {
    private String brand;
    private String size;
    private String color;
    private int price;


    public TShirt(String brand,String size, String color, int price){
        System.out.println("String, String, String, int -arg const of TShirt");
        this.brand = brand;
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

    @Override
    public int hashCode() {
        return 235;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof TShirt){
                System.out.println("obj is instance of TShirt");
                TShirt tShirt1 = this;
                TShirt tShirt2 = (TShirt) obj;
                if(tShirt1.brand == tShirt2.brand && tShirt1.color == tShirt2.color){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
