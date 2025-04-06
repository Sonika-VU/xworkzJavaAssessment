package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.HomeLoan;
import com.xworkz.isARelation.Loan;

public class LoanRunner {
    public static void main(String[] args) {
        Loan loan = new Loan();
        Loan loan1 = new HomeLoan();
        HomeLoan homeLoan = new HomeLoan();

        System.out.println("=====================");
        loan.disburseLoan();
        loan.checkEligibility();
        loan.applyLoan();
        loan.disburseLoan();
        loan.repayLoan();

        System.out.println("=====================");
        loan1.disburseLoan();
        loan1.checkEligibility();
        loan1.applyLoan();
        loan1.disburseLoan();
        loan1.repayLoan();

        System.out.println("=====================");
        homeLoan.disburseLoan();
        homeLoan.checkEligibility();
        homeLoan.applyLoan();
        homeLoan.disburseLoan();
        homeLoan.repayLoan();
    }
}
