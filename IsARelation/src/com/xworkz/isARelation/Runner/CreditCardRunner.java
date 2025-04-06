package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.CreditCard;
import com.xworkz.isARelation.VisaCard;

public class CreditCardRunner {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        CreditCard creditCard1 = new VisaCard();
        VisaCard visaCard = new VisaCard();

        System.out.println("==========================");
        creditCard.checkBalance();
        creditCard.earnRewards();
        creditCard.makePayment();
        creditCard.payBill();
        creditCard.withdrawCash();

        System.out.println("==========================");
        creditCard1.checkBalance();
        creditCard1.earnRewards();
        creditCard1.makePayment();
        creditCard1.payBill();
        creditCard1.withdrawCash();

        System.out.println("==========================");
        visaCard.checkBalance();
        visaCard.earnRewards();
        visaCard.makePayment();
        visaCard.payBill();
        visaCard.withdrawCash();
    }
}
