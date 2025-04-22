package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.EWallet;

public class PPayWallet implements EWallet {
    public PPayWallet(){
        System.out.println("no-arg const of PPayWallet");
    }

    @Override
    public void addMoney() {
        System.out.println("Running addMoney in PPayWallet");
    }
}
