package com.xworkz.ObjectMethodUsage.internal;

public class Bangle {
    private String material;
    private int size;
    private double cost;

    public Bangle(String material, int size, double cost){
        System.out.println("String, int, cost-arg const of Bangle");
        this.material = material;
        this.size = size;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Bangle{" +
                "material='" + material + '\'' +
                ", size=" + size +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int hashCode() {
        return 34;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Bangle){
                System.out.println("Ref instanceOf Bangle");
                Bangle bangle1 = this;
                Bangle bangle2 = (Bangle) obj;
                if(bangle1.material == bangle2.material ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
