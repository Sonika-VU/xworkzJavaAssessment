package com.xworkz.busy.runner;

import com.xworkz.busy.external.LoanApplier;
import com.xworkz.busy.internal.implementor.SbiLoanImpl;
import com.xworkz.busy.internal.rules.LoanProcessor;

public class LoanProcessorRunner {
    public static void main(String[] args) {
        LoanProcessor loanProcessor = new SbiLoanImpl();
        LoanApplier loanApplier = new LoanApplier(loanProcessor);

        loanApplier.apply();
    }
}
