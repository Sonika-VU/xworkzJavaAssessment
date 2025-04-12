package com.xworkz.ObjectMethodUsage.internal;

public class Gadget {
    private String brand;
    private String type;
    private double weight;

    public Gadget(String brand, String type, double weight) {
        System.out.println("String, String, double-arg const of Gadget");
        this.brand = brand;
        this.type = type;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Gadget{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int hashCode() {
        return 3241;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Gadget){
                System.out.println("Ref instanceOf Gadget");
                Gadget gadget1 = this;
                Gadget gadget2 = (Gadget) obj;
                if(gadget1.type == gadget2.type && gadget1.weight == gadget2.weight ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
