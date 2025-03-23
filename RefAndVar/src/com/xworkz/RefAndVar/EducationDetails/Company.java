package com.xworkz.RefAndVar.EducationDetails;

public class Company {

    String name;
    String ceo;
    int establishedYear;
    int noOfEmp;

    Company(String name, String ceo, int establishedYear, int noOfEmp){
        this.name = name;
        this.ceo = ceo;
        this.establishedYear = establishedYear;
        this.noOfEmp = noOfEmp;
    }

     HouseKeep houseKeep = new HouseKeep("Samruddhi", "VarunTej", 122, "BTM Layout");

    void display(){
        System.out.println("In Company : ");
        System.out.println("Company name : "+this.name);
        System.out.println("CEO : "+this.ceo);
        System.out.println("Established Year : "+this.establishedYear);
        System.out.println("No of Emmployees : "+this.noOfEmp);
        System.out.println("============================================");

        houseKeep.display();
    }
}
