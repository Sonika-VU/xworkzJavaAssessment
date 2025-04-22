package com.xworkz.busy.runner;

import com.xworkz.busy.external.CurrencyConverterUser;
import com.xworkz.busy.internal.implementor.RsToDollarConverter;
import com.xworkz.busy.internal.rules.CurrencyConverter;

public class CurrencyConverterRunner {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new RsToDollarConverter();
        CurrencyConverterUser currencyConverterUser = new CurrencyConverterUser(currencyConverter);

        currencyConverterUser.getActualAmount();
    }
}
