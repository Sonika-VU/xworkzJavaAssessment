package com.xworkz.isARelation;

public class Dollar extends Currency {
    public Dollar() {
        super();
        System.out.println("no-arg const of Dollar");
    }

    {
        super.exchange();
        System.out.println("Exchanging Dollar");
    }

    {
        super.checkValue();
        System.out.println("Checking Dollar value");
    }

    {
        super.useForPayment();
        System.out.println("Using Dollar for payments");
    }

    {
        super.deposit();
        System.out.println("Depositing Dollar in bank");
    }

    {
        super.withdraw();
        System.out.println("Withdrawing Dollar from ATM");
    }
}
