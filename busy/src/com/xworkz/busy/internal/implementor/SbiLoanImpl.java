package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.LoanProcessor;

public class SbiLoanImpl implements LoanProcessor {
    public SbiLoanImpl(){
        System.out.println("no-arg const of SbiLoanImpl");
    }
    @Override
    public void processLoan() {
        System.out.println("Running processLoan in SbiLoanImpl");
    }
}
