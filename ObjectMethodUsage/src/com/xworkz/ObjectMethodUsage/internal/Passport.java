package com.xworkz.ObjectMethodUsage.internal;

public class Passport {
    private String holderName;
    private String passportNumber;
    private int expiryYear;

    public Passport(String holderName, String passportNumber, int expiryYear) {
        System.out.println("String, String, int-arg const of Passport");
        this.holderName = holderName;
        this.passportNumber = passportNumber;
        this.expiryYear = expiryYear;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "holderName='" + holderName + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", expiryYear=" + expiryYear +
                '}';
    }

    @Override
    public int hashCode() {
        return -65;
    }
}
