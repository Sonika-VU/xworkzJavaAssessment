package com.xworkz.RefAndVar.CountryDetails;

public class PersonalAssistant {

    String name;
    String area;
    int noOfYears;
    double salary;

    PersonalAssistant(String name, String area, int noOfYears, double salary){
        this.name = name;
        this.area = area;
        this.noOfYears = noOfYears;
        this.salary = salary;
    }

    void display(){
        System.out.println("In PersonalAssistant  : ");
        System.out.println("Name : "+this.name);
        System.out.println("Area : "+this.area);
        System.out.println("No of years worked : "+this.noOfYears);
        System.out.println("Salary : "+this.salary);
        System.out.println("=========================================");
    }
}
