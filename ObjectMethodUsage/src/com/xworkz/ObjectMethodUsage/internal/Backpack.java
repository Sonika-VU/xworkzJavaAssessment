package com.xworkz.ObjectMethodUsage.internal;

public class Backpack {
    private String brand;
    private int compartments;
    private boolean hasLaptopSection;

    public Backpack(String brand, int compartments, boolean hasLaptopSection) {
        System.out.println("String, int, boolean-arg const of Backpack");
        this.brand = brand;
        this.compartments = compartments;
        this.hasLaptopSection = hasLaptopSection;
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "brand='" + brand + '\'' +
                ", compartments=" + compartments +
                ", hasLaptopSection=" + hasLaptopSection +
                '}';
    }

    @Override
    public int hashCode() {
        return -909;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Backpack){
                System.out.println("Ref instanceOf Antique");
                Backpack backpack1 = this;
                Backpack backpack2 = (Backpack) obj;
                if(backpack1.brand == backpack2.brand ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
