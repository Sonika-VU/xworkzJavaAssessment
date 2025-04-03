package com.xworkz.isARelation;

public class VisaCard extends CreditCard {
    public VisaCard() {
        super();
        System.out.println("no-arg const of VisaCard");
    }

    {
        super.makePayment();
        System.out.println("Making secure Visa payment");
    }

    {
        super.checkBalance();
        System.out.println("Checking Visa card balance");
    }

    {
        super.withdrawCash();
        System.out.println("Visa card ATM withdrawal");
    }

    {
        super.earnRewards();
        System.out.println("Earning Visa rewards points");
    }

    {
        super.payBill();
        System.out.println("Paying Visa card bill");
    }
}
