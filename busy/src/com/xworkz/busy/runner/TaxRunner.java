package com.xworkz.busy.runner;

import com.xworkz.busy.external.TaxUser;
import com.xworkz.busy.internal.implementor.IndianTaxCalci;
import com.xworkz.busy.internal.rules.TaxCalculator;

public class TaxRunner {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new IndianTaxCalci();
        TaxUser taxUser = new TaxUser(taxCalculator);

        taxUser.applyTax();
    }
}
