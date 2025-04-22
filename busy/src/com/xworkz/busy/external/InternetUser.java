package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.InternetProvider;

public class InternetUser {
    InternetProvider internetProvider;

    public InternetUser(InternetProvider internetProvider){
        this.internetProvider = internetProvider;
        System.out.println("internetProvider-arg const of InternetUser");
    }

    public void useInternet(){
        System.out.println("Running useInternet in InternetUser");
        if(this.internetProvider != null){
            this.internetProvider.provide();
        }
    }
}
