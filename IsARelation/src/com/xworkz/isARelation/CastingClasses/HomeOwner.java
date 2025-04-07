package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.HomeLoan;
import com.xworkz.isARelation.Loan;

public class HomeOwner {

    public void buildHome(Loan loan){
        loan.disburseLoan();
        loan.checkEligibility();
        loan.applyLoan();
        loan.disburseLoan();
        loan.repayLoan();

        if(loan instanceof HomeLoan){
            HomeLoan homeLoan = (HomeLoan) loan;
            homeLoan.withdrawLoan();
        }
    }
}
