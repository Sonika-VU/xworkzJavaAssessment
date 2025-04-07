package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.CreditCard;
import com.xworkz.isARelation.VisaCard;

public class InternationTourist {

    public void rome(CreditCard creditCard){
        creditCard.checkBalance();
        creditCard.earnRewards();
        creditCard.makePayment();
        creditCard.payBill();
        creditCard.withdrawCash();

        if(creditCard instanceof VisaCard){
            VisaCard visaCard = (VisaCard) creditCard;
            visaCard.planTrip();
        }
    }
}
