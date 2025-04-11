package com.xworkz.ObjectMethodUsage.internal;

public class Chair {
    private  String material;
    private String color;
    private double price;

    public Chair(String material, String color, double price){
        System.out.println("String, String, double-arg const of Chair");
    }

    @Override
    public String toString() {
        return "Chair{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public int hashCode() {
        return -45;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Chair){
                System.out.println("Ref instanceOf Antique");
                Chair chair1 = this;
                Chair chair2 = (Chair) obj;
                if(chair2.material == chair1.material ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
