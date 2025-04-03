package com.xworkz.isARelation;

public class Bank {
    public Bank() {
        System.out.println("no-arg const of Bank");
    }

    public void openAccount() {
        System.out.println("Running openAccount in Bank");
    }

    public void closeAccount() {
        System.out.println("Running closeAccount in Bank");
    }

    public void depositMoney() {
        System.out.println("Running depositMoney in Bank");
    }

    public void withdrawMoney() {
        System.out.println("Running withdrawMoney in Bank");
    }

    public void checkBalance() {
        System.out.println("Running checkBalance in Bank");
    }
}
