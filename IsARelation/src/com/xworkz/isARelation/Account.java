package com.xworkz.isARelation;

public class Account extends Bank {
    public Account() {
        super();
        System.out.println("no-arg const of Account");
    }

    @Override
    public void openAccount(){
//        super.openAccount();
        System.out.println("Running openAccount in Account");
    }

    @Override
    public void depositMoney(){
//        super.depositMoney();
        System.out.println("Running depositMoney in Account");
    }

    @Override
    public void withdrawMoney(){
//        super.withdrawMoney();
        System.out.println("Running withdrawMoney in Account");
    }

    @Override
    public void checkBalance(){
//        super.checkBalance();
        System.out.println("Running checkBalance in Account");
    }

    @Override
    public void closeAccount(){
//        super.closeAccount();
        System.out.println("Running closeAccount in Account");
    }

    public void issueLoan(){
        System.out.println("Running issueLoan in Account");
    }
}
