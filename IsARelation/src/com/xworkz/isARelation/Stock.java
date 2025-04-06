package com.xworkz.isARelation;

public class Stock extends Investment {
    public Stock() {
        super();
        System.out.println("no-arg const of Stock");
    }

    @Override
    public void investMoney(){
//        super.investMoney();
        System.out.println("Investing money in Stock market");
    }

    @Override
    public void calculateReturns(){
//        super.calculateReturns();
        System.out.println("Calculating Stock returns");
    }

    @Override
    public void withdrawInvestment(){
//        super.withdrawInvestment();
        System.out.println("Selling Stocks to withdraw");
    }

    @Override
    public  void diversifyPortfolio(){
//        super.diversifyPortfolio();
        System.out.println("Diversifying Stocks in portfolio");
    }

    @Override
    public void analyzeMarket(){
//        super.analyzeMarket();
        System.out.println("Analyzing stock market trends");
    }
}
