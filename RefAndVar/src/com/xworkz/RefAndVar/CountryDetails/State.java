package com.xworkz.RefAndVar.CountryDetails;

public class State {
    String name;
    int population;
    String cm;
    boolean surroundsWater;

    State(String name, int population, String cm,boolean surroundsWater ){
        this.name = name;
        this.population = population;
        this.cm = cm;
        this.surroundsWater =surroundsWater;

    }

    void display() {
        System.out.println("In state : ");
        System.out.println("Name : "+this.name);
        System.out.println("Population : "+this.population);
        System.out.println("CM : "+this.cm);
        System.out.println("isSurroundedByWater : "+this.surroundsWater);
        System.out.println("===================================");
    }
}
