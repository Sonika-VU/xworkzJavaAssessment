package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Currency;
import com.xworkz.isARelation.Dollar;

public class CurrencyRunner {
    public static void main(String[] args) {
        Currency currency = new Currency();
        Currency currency1 = new Dollar();
        Dollar dollar = new Dollar();

        System.out.println("=======================");
        currency.checkValue();
        currency.deposit();
        currency.exchange();
        currency.useForPayment();
        currency.withdraw();

        System.out.println("=======================");
        currency1.checkValue();
        currency1.deposit();
        currency1.exchange();
        currency1.useForPayment();
        currency1.withdraw();

        System.out.println("=======================");
        dollar.checkValue();
        dollar.deposit();
        dollar.exchange();
        dollar.useForPayment();
        dollar.withdraw();
    }
}
