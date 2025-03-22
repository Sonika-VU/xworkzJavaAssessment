package com.xworkz.RefAndVar.CountryDetails;

public class House {
    String name;
    String area;
    double cost;
    int noOfPeople;

    House(String name, String area, double cost, int noOfPeople){
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.noOfPeople = noOfPeople;
    }

    void display(){
        System.out.println("In House : ");
        System.out.println("Name : "+this.name);
        System.out.println("Area : "+this.area);
        System.out.println("Cost : "+this.cost);
        System.out.println("No of people : "+this.noOfPeople);
        System.out.println("======================================");
    }

}
