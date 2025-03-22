package com.xworkz.RefAndVar.CountryDetails;

public class Minister {
    String name;
    String position;
    int noOfYears;
    double salary;

    PersonalAssistant personalAssistant = new PersonalAssistant("Ramu","Bangalore", 5,500000);
    House house = new House("SeetaRama", "Bangalore", 1000000, 5);
    Portfolio portfolio1 = new Portfolio("Geeta", "Stocks", 1000000, 7);
    Portfolio portfolio2 = new Portfolio("Seeeta", "Real-Estate", 200000, 2);
    Portfolio[] portfolios = {portfolio1, portfolio2};
    Security security = new Security("Suresh", "Bangalore", "10" , 20000);

    Minister(String name, String position, int noOfYears, double salary){
        this.name = name;
        this.position = position;
        this.noOfYears = noOfYears;
        this.salary = salary;
    }

    void display() {
        System.out.println("In Minister : ");
        System.out.println("Name : "+this.name);
        System.out.println("Position : "+this.position);
        System.out.println("No of years  : "+this.noOfYears);
        System.out.println("Salary : "+this.salary);
        System.out.println("===================================");

        personalAssistant.display();
        house.display();
        for(Portfolio portfolio : portfolios){
            portfolio.display();
        }
        security.display();

    }
}
