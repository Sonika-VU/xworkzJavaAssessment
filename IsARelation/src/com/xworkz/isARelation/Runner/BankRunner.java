package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Account;
import com.xworkz.isARelation.Bank;

public class BankRunner {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Bank bank1 = new Account();
        Account account = new Account();

        bank.openAccount();
        bank.checkBalance();
        bank.depositMoney();
        bank.withdrawMoney();
        bank.closeAccount();

        System.out.println("======================");

        bank1.openAccount();
        bank1.checkBalance();
        bank1.depositMoney();
        bank1.withdrawMoney();
        bank1.closeAccount();

        System.out.println("======================");

        account.openAccount();
        account.checkBalance();
        account.depositMoney();
        account.withdrawMoney();
        account.closeAccount();

        System.out.println("======================");
    }
}
