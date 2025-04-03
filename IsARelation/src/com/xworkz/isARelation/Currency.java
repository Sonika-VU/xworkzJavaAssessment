package com.xworkz.isARelation;

public class Currency {
    public Currency() {
        System.out.println("no-arg const of Currency");
    }

    public void exchange() {
        System.out.println("Exchanging currency");
    }

    public void checkValue() {
        System.out.println("Checking currency value");
    }

    public void useForPayment() {
        System.out.println("Using currency for payment");
    }

    public void deposit() {
        System.out.println("Depositing currency in bank");
    }

    public void withdraw() {
        System.out.println("Withdrawing currency from bank");
    }
}
