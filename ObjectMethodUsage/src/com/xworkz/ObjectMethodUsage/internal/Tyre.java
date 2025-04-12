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

    @Override
    public int hashCode() {
        return 21891;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Tyre) {
                System.out.println("Ref instanceOf Tyre");
                Tyre tyre1 = this;
                Tyre  tyre2 = (Tyre) obj;
                if (tyre2.price == tyre1.price && tyre2.forVehicle == tyre1.forVehicle && tyre2.material == tyre1.material) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
