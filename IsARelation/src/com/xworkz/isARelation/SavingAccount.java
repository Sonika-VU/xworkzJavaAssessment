package com.xworkz.isARelation;

public class SavingAccount extends BankAccount{

    public SavingAccount(){
        super();
        System.out.println("no-arg const of SavingAccount");
    }

    {
        super.openAccount();
        System.out.println("Running openAccount in SavingAccount");
    }

    {
        super.deposit();
        System.out.println("Running deposit in SavingAccount");
    }

    {
        super.withdraw();
        System.out.println("Running withdraw in SavingAccount");
    }

    {
        super.takeLoan();
        System.out.println("Running takeLoan in SavingAccount");
    }

    {
        super.closeAccount();
        System.out.println("Running closeAccount in SavingAccount");
    }
}
