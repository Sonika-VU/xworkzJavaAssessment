package com.xworkz.isARelation;

public class HomeLoan extends Loan {
    public HomeLoan() {
        super();
        System.out.println("no-arg const of HomeLoan");
    }

    {
        super.applyLoan();
        System.out.println("Applying for Home Loan");
    }

    {
        super.checkEligibility();
        System.out.println("Checking Home Loan eligibility");
    }

    {
        super.approveLoan();
        System.out.println("Approving Home Loan");
    }

    {
        super.disburseLoan();
        System.out.println("Disbursing Home Loan");
    }

    {
        super.repayLoan();
        System.out.println("Repaying Home Loan in EMI");
    }
}
