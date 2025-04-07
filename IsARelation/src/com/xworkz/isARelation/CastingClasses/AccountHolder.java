package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.BankAccount;
import com.xworkz.isARelation.SavingAccount;

public class AccountHolder {

    public void getAccDetails(BankAccount bankAccount){
        bankAccount.openAccount();
        bankAccount.withdraw();
        bankAccount.deposit();
        bankAccount.takeLoan();
        bankAccount.closeAccount();

        if(bankAccount instanceof SavingAccount){
            SavingAccount savingAccount = (SavingAccount) bankAccount;
            savingAccount.writeCheck();
        }

    }
}
