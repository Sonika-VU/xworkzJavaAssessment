package com.xworkz.ObjectMethodUsage.internal;

public class Cup {
    private String material;
    private double volume;
    private String color;

    public Cup(String material, double volume, String color) {
        System.out.println("String, double, String-arg const of Cup");
        this.material = material;
        this.volume = volume;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "material='" + material + '\'' +
                ", volume=" + volume +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return -943085;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Cup){
                System.out.println("Ref instanceOf Cup");
                Cup cup1 = this;
                Cup cup2 = (Cup) obj;
                if(cup1.material == cup2.material ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
