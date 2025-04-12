package com.xworkz.ObjectMethodUsage.internal;

public class Soap {
    private String brand;
    private String fragrance;
    private boolean isAntibacterial;

    public Soap(String brand, String fragrance, boolean isAntibacterial) {
        System.out.println("String, String, boolean-arg const of Soap");
        this.brand = brand;
        this.fragrance = fragrance;
        this.isAntibacterial = isAntibacterial;
    }

    @Override
    public String toString() {
        return "Soap{" +
                "brand='" + brand + '\'' +
                ", fragrance='" + fragrance + '\'' +
                ", isAntibacterial=" + isAntibacterial +
                '}';
    }
    @Override
    public int hashCode() {
        return 19;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Soap) {
                System.out.println("Ref instanceOf Soap");
                Soap soap1 = this;
                Soap  soap2 = (Soap) obj;
                if (soap2.isAntibacterial == soap1.isAntibacterial && soap2.brand == soap1.brand && soap2.fragrance == soap1.fragrance) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
