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
}
