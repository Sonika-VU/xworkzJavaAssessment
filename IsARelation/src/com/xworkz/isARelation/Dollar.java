package com.xworkz.isARelation;

public class Dollar extends Currency {
    public Dollar() {
        super();
        System.out.println("no-arg const of Dollar");
    }

    @Override
    public void exchange(){
//        super.exchange();
        System.out.println("Exchanging Dollar");
    }

    @Override
    public void checkValue(){
//        super.checkValue();
        System.out.println("Checking Dollar value");
    }

    @Override
    public void useForPayment(){
//        super.useForPayment();
        System.out.println("Using Dollar for payments");
    }

    @Override
    public void deposit(){
//        super.deposit();
        System.out.println("Depositing Dollar in bank");
    }

    @Override
    public void withdraw(){
//        super.withdraw();
        System.out.println("Withdrawing Dollar from ATM");
    }
}
