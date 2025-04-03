package com.xworkz.isARelation;

public class BankAccount {

    public BankAccount(){
        System.out.println("no-arg const of BankAccount");
    }

    public void openAccount(){
        System.out.println("Running openAccount in BankAccount");
    }

    public void deposit(){
        System.out.println("Running deposit in BankAccount");
    }

    public void withdraw(){
        System.out.println("Running withdraw in BankAccount");
    }

    public void takeLoan(){
        System.out.println("Running takeLoan in BankAccount");
    }

    public void closeAccount(){
        System.out.println("Running closeAccount in BankAccount");
    }
}
