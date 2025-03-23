package com.xworkz.RefAndVar.EducationDetails;

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

    Personnel personnel1 = new Personnel("Construction", "Bangalore", "B.E", 100);
    Personnel personnel2 = new Personnel("Paper Manufacture", "Mysuru", "12", 10000);
    Personnel[] personnels = {personnel1, personnel2};

    public void display(){
        System.out.println("In Security : ");
        System.out.println("Name : "+name);
        System.out.println("Area : "+area);
        System.out.println("Quallification : "+qualification);
        System.out.println("Salary : "+salary);
        System.out.println("======================================");

        for (Personnel personnel : personnels){
            personnel.display();
        }
    }

}
