package com.xworkz.ObjectMethodUsage.internal;

public class Tyre {
    private String material;
    private String forVehicle;
    private double price;

    public Tyre(String material, String forVehicle, double price){
        this.material = material;
        this.forVehicle = forVehicle;
        this.price = price;
        System.out.println("String, String, double const of Tyre");
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "material='" + material + '\'' +
                ", forVehicle='" + forVehicle + '\'' +
                ", price=" + price +
                '}';
    }
}
