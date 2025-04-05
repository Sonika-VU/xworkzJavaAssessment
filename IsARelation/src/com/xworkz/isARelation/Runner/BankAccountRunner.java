package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.BankAccount;
import com.xworkz.isARelation.SavingAccount;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        BankAccount bankAccount1 = new SavingAccount();
        SavingAccount savingAccount = new SavingAccount();

        bankAccount.closeAccount();
        bankAccount.openAccount();
        bankAccount.deposit();
        bankAccount.takeLoan();
        bankAccount.withdraw();

        System.out.println("==========================");

        bankAccount1.closeAccount();
        bankAccount1.openAccount();
        bankAccount1.deposit();
        bankAccount1.takeLoan();
        bankAccount1.withdraw();

        System.out.println("==========================");

        savingAccount.closeAccount();
        savingAccount.openAccount();
        savingAccount.deposit();
        savingAccount.takeLoan();
        savingAccount.withdraw();

        System.out.println("==========================");
    }
}
