package com.xworkz.busy.runner;

import com.xworkz.busy.external.EWalletUser;
import com.xworkz.busy.internal.implementor.PPayWallet;
import com.xworkz.busy.internal.rules.EWallet;

public class EWalletRunner {
    public static void main(String[] args) {
        EWallet eWallet = new PPayWallet();
        EWalletUser eWalletUser = new EWalletUser(eWallet);

        eWalletUser.checkBalance();
    }

}
