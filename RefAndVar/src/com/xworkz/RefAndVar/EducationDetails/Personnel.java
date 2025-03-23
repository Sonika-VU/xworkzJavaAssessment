package com.xworkz.RefAndVar.EducationDetails;

public class Personnel {

    String workType;
    String location;
    String qualification;
    int noOfPeople;

    Personnel(String workType, String location, String qualification, int noOfPeople){
        this.workType = workType;
        this.location = location;
        this.qualification = qualification;
        this.noOfPeople = noOfPeople;
    }

    Skill skill = new Skill("Java Developer", 5, "Bangalore", true);

    void display(){
        System.out.println("In Personnel : ");
        System.out.println("Work Type : "+this.workType);
        System.out.println("Location : "+this.location);
        System.out.println("Qualification : "+this.qualification);
        System.out.println("No of People : "+this.location);
        System.out.println("======================================");

        skill.display();
    }
}
