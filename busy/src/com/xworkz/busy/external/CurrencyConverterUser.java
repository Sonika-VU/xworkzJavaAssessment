package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.CurrencyConverter;

public class CurrencyConverterUser {

    CurrencyConverter currencyConverter;

    public CurrencyConverterUser(CurrencyConverter currencyConverter){
        this.currencyConverter = currencyConverter;
        System.out.println("currencyConverter-arg const of CurrencyConverterUser");
    }

    public void getActualAmount(){
        System.out.println("Running getActualAmount in CurrencyConverterUser");
        if(this.currencyConverter != null){
            this.currencyConverter.convert();
        }
    }
}
