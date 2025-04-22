package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.LoanProcessor;

public class LoanApplier {
    LoanProcessor loanProcessor;

    public LoanApplier(LoanProcessor loanProcessor){
        this.loanProcessor = loanProcessor;
        System.out.println("loanProcessor-arg const of LoanApplier");
    }

    public void apply(){
        System.out.println("Running apply in LoanApplier");
        if(this.loanProcessor != null){
            this.loanProcessor.processLoan();
        }
    }
}
