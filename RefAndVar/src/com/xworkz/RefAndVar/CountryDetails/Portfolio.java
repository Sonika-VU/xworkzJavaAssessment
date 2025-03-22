package com.xworkz.RefAndVar.CountryDetails;

public class Portfolio {

    String ownerName;
    String asset;
    double price;
    int riskLevel;

    Portfolio(String ownerName, String asset, double price, int riskLevel){
        this.ownerName = ownerName;
        this.asset = asset;
        this.price = price;
        this.riskLevel = riskLevel;
    }

    void display(){
        System.out.println("In Portfolio  : ");
        System.out.println("Owner name : "+ownerName);
        System.out.println("Asset : "+asset);
        System.out.println("Price : "+price);
        System.out.println("Risk level : "+riskLevel);
        System.out.println("=================================");
    }
}
