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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Passport) {
                System.out.println("Ref instanceOf Passport");
                Passport passport1 = this;
                Passport  passport2 = (Passport) obj;
                if (passport1.holderName == passport2.holderName && passport1.passportNumber == passport2.passportNumber &&passport1.expiryYear == passport2.expiryYear) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
