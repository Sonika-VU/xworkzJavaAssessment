package com.xworkz.RefAndVar.CountryDetails;

public class PrimeMinister {

    String name;
    String country;
    int year;
    int service;

    PrimeMinister(String name, String country, int year, int service){
        this.name = name;
        this.country = country;
        this.year = year;
        this.service = service;
    }

    Minister minister1 = new Minister("Nirmala Seetaraman", "Finanace", 4,7000000);
    Minister minister2 = new Minister("Rajnath Singh", "Defence Minister", 4, 6400099);

    Minister[] ministers = {minister1, minister2};

    Portfolio portfolio1 = new Portfolio("Geeta", "Stocks", 1000000, 7);
    Portfolio portfolio2 = new Portfolio("Seeeta", "Real-Estate", 200000, 2);
    Portfolio[] portfolios = {portfolio1, portfolio2};

    State state1 = new State("Karnataka", 5000000, "Siddramaiah", false );
    State state2 = new State("Goa",1000000 ,"Pramod Sawanth", true);
    State[] states = {state1, state2};

    Security security = new Security("Ramesh", "Mysuru", "12", 20388);


    void display (){
        System.out.println("In PrimeMinister : ");
        System.out.println("Name : "+this.name);
        System.out.println("Country : "+ this.country);
        System.out.println("Year : "+this.year);
        System.out.println("Service : "+this.service);
        System.out.println("=============================");

        for(Minister minister : ministers){
            minister.display();
        }

        for (Portfolio portfolio : portfolios){
            portfolio.display();
        }

        for(State state : states){
            state.display();
        }

        security.display();
    }
}
