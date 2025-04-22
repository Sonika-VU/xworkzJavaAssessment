package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.CurrencyConverter;

public class RsToDollarConverter implements CurrencyConverter {
    public RsToDollarConverter(){
        System.out.println("no-arg const of RsToDollarConverter");
    }

    @Override
    public void convert() {
        System.out.println("Running convert in RsToDollarConverter");
    }
}
