package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.EWallet;

public class EWalletUser {

    EWallet eWallet ;
    public EWalletUser(EWallet ewallet){
        this.eWallet = ewallet;
        System.out.println("eWallet-arg const of EWalletUser ");
    }

    public void checkBalance(){
        System.out.println("Running checkBalance in EWalletUser");
        if(this.eWallet != null){
            this.eWallet.addMoney();
        }
    }
}
