package com.xworkz.isARelation;

public class VisaCard extends CreditCard {
    public VisaCard() {
        super();
        System.out.println("no-arg const of VisaCard");
    }

    @Override
    public void makePayment(){
//        super.makePayment();
        System.out.println("Making secure Visa payment");
    }

    @Override
    public void checkBalance(){
//        super.checkBalance();
        System.out.println("Checking Visa card balance");
    }

    @Override
    public void withdrawCash(){
//        super.withdrawCash();
        System.out.println("Visa card ATM withdrawal");
    }

    @Override
    public void earnRewards(){
        super.earnRewards();
        System.out.println("Earning Visa rewards points");
    }

    @Override
    public void payBill(){
//        super.payBill();
        System.out.println("Paying Visa card bill");
    }

    public  void planTrip(){
        System.out.println("Running planTrip in VisaCard");
    }
}
