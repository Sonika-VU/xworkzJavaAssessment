package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Investment;
import com.xworkz.isARelation.Stock;

public class Business {
    public void checkStock(Investment investment){
        investment.investMoney();
        investment.withdrawInvestment();
        investment.analyzeMarket();
        investment.calculateReturns();
        investment.diversifyPortfolio();

        if(investment instanceof Stock){
            Stock stock = (Stock) investment;
            stock.sellProduct();
        }
    }
}
