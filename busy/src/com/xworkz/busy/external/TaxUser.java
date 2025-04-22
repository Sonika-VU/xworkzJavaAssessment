package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.TaxCalculator;

public class TaxUser {
    TaxCalculator taxCalculator ;

    public TaxUser (TaxCalculator taxCalculator){
        this.taxCalculator = taxCalculator;
        System.out.println("taxCalculator-arg const of TaxUser");
    }

    public void applyTax(){
        System.out.println("Running applyTax in TaxUser");
        if(this.taxCalculator != null){
            this.taxCalculator.calculateTax();
        }
    }
}
