package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Currency;
import com.xworkz.isARelation.Dollar;

public class CoinMuseum {
    public void collectCoin(Currency currency){
        currency.checkValue();
        currency.deposit();
        currency.exchange();
        currency.useForPayment();
        currency.withdraw();

        if(currency instanceof Dollar){
            Dollar dollar = (Dollar) currency;
            dollar.keepMuseum();
        }
    }
}
