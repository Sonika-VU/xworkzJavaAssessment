package com.xworkz.RefAndVar.CountryDetails;

public class Security {

    String name;
    String area;
    String qualification;
    double salary;

    public Security(String name, String area, String qualification, double salary) {
        this.name = name;
        this.area = area;
        this.qualification = qualification;
        this.salary = salary;
    }

    void display(){
        System.out.println("In Security : ");
        System.out.println("Name : "+name);
        System.out.println("Area : "+area);
        System.out.println("Quallification : "+qualification);
        System.out.println("Salary : "+salary);
        System.out.println("======================================");
    }


}
