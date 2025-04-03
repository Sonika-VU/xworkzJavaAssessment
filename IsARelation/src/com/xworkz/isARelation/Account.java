package com.xworkz.isARelation;

public class Account extends Bank {
    public Account() {
        super();
        System.out.println("no-arg const of Account");
    }

    {
        super.openAccount();
        System.out.println("Running openAccount in Account");
    }

    {
        super.depositMoney();
        System.out.println("Running depositMoney in Account");
    }

    {
        super.withdrawMoney();
        System.out.println("Running withdrawMoney in Account");
    }

    {
        super.checkBalance();
        System.out.println("Running checkBalance in Account");
    }

    {
        super.closeAccount();
        System.out.println("Running closeAccount in Account");
    }
}
