package com.xworkz.isARelation;

public class SavingAccount extends BankAccount{

    public SavingAccount(){
        super();
        System.out.println("no-arg const of SavingAccount");
    }

    @Override
    public void openAccount(){
//        super.openAccount();
        System.out.println("Running openAccount in SavingAccount");
    }

    @Override
    public void deposit(){
//        super.deposit();
        System.out.println("Running deposit in SavingAccount");
    }

    @Override
    public  void withdraw(){
//        super.withdraw();
        System.out.println("Running withdraw in SavingAccount");
    }

    @Override
    public void takeLoan(){
//        super.takeLoan();
        System.out.println("Running takeLoan in SavingAccount");
    }

    @Override
    public void closeAccount(){
//        super.closeAccount();
        System.out.println("Running closeAccount in SavingAccount");
    }
}
