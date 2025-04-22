package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.TaxCalculator;

public class IndianTaxCalci implements TaxCalculator {

    public IndianTaxCalci(){
        System.out.println("no-arg cosnt of IndianTaxCalci");
    }
    @Override
    public void calculateTax() {
        System.out.println("Running calculateTax in IndianTaxCalci");
    }
}
