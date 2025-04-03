package com.xworkz.isARelation;

public class Stock extends Investment {
    public Stock() {
        super();
        System.out.println("no-arg const of Stock");
    }

    {
        super.investMoney();
        System.out.println("Investing money in Stock market");
    }

    {
        super.calculateReturns();
        System.out.println("Calculating Stock returns");
    }

    {
        super.withdrawInvestment();
        System.out.println("Selling Stocks to withdraw");
    }

    {
        super.diversifyPortfolio();
        System.out.println("Diversifying Stocks in portfolio");
    }

    {
        super.analyzeMarket();
        System.out.println("Analyzing stock market trends");
    }
}
