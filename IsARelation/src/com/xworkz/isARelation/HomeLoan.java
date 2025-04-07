package com.xworkz.isARelation;

public class HomeLoan extends Loan {
    public HomeLoan() {
        super();
        System.out.println("no-arg const of HomeLoan");
    }

    @Override
    public void applyLoan(){
//        super.applyLoan();
        System.out.println("Applying for Home Loan");
    }

    @Override
    public void checkEligibility(){
//        super.checkEligibility();
        System.out.println("Checking Home Loan eligibility");
    }

    @Override
    public void approveLoan(){
//        super.approveLoan();
        System.out.println("Approving Home Loan");
    }

    @Override
    public void disburseLoan(){
//        super.disburseLoan();
        System.out.println("Disbursing Home Loan");
    }

    @Override
    public void repayLoan(){
//        super.repayLoan();
        System.out.println("Repaying Home Loan in EMI");
    }

    public void withdrawLoan(){
        System.out.println("Running withdrawLoan in HomeLoan");
    }
}
