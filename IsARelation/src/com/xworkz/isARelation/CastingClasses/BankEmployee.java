package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Account;
import com.xworkz.isARelation.Bank;

public class BankEmployee {

    public void work(Bank bank){
        bank.openAccount();
        bank.closeAccount();
        bank.withdrawMoney();
        bank.depositMoney();
        bank.checkBalance();

        if(bank instanceof Account){
            Account account = (Account) bank;
            account.issueLoan();
        }

    }
}
