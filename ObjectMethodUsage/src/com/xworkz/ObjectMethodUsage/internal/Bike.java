package com.xworkz.ObjectMethodUsage.internal;

public class Bike {
    private String brand;
    private int cc;
    private double mileage;

    public Bike(String brand, int cc, double mileage) {
        System.out.println("String, int, double-arg const of Bike");
        this.brand = brand;
        this.cc = cc;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + brand + '\'' +
                ", cc=" + cc +
                ", mileage=" + mileage +
                '}';
    }

    @Override
    public int hashCode() {
        return 930;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Bike){
                System.out.println("Ref instanceOf Antique");
                Bike bike1 = this;
                Bike bike2 = (Bike) obj;
                if(bike1.brand == bike2.brand ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
