package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Investment;
import com.xworkz.isARelation.Stock;

public class InvestmentRunner {
    public static void main(String[] args) {
        Investment investment = new Investment();
        Investment investment1 = new Stock();
        Stock stock = new Stock();

        System.out.println("=========================");
        investment.investMoney();
        investment.withdrawInvestment();
        investment.analyzeMarket();
        investment.calculateReturns();
        investment.diversifyPortfolio();

        System.out.println("=========================");
        investment1.investMoney();
        investment1.withdrawInvestment();
        investment1.analyzeMarket();
        investment1.calculateReturns();
        investment1.diversifyPortfolio();

        System.out.println("=========================");
        stock.investMoney();
        stock.withdrawInvestment();
        stock.analyzeMarket();
        stock.calculateReturns();
        stock.diversifyPortfolio();
    }
}
