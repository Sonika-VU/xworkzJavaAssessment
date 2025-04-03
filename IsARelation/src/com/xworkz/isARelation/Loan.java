package com.xworkz.isARelation;

public class Loan {
    public Loan() {
        System.out.println("no-arg const of Loan");
    }

    public void applyLoan() {
        System.out.println("Applying for loan");
    }

    public void checkEligibility() {
        System.out.println("Checking loan eligibility");
    }

    public void approveLoan() {
        System.out.println("Approving loan");
    }

    public void disburseLoan() {
        System.out.println("Disbursing loan amount");
    }

    public void repayLoan() {
        System.out.println("Repaying loan in installments");
    }
}
