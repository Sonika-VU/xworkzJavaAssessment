package com.xworkz.RefAndVar.EducationDetails;

public class Skill {

    String type;
    int noOfYearsWorked;
    String location;
    boolean isSatisfied;

    Skill(String type, int noOfYearsWorked, String location, boolean isSatisfied){
        this.type = type;
        this.noOfYearsWorked = noOfYearsWorked;
        this.location = location;
        this.isSatisfied = isSatisfied;
    }
    Experience experience = new Experience("Java Developer", 12, "Bangalore", "SLK");

    void display(){
        System.out.println("In Skill : ");
        System.out.println("Type : "+this.type);
        System.out.println("No of years Worked : "+this.noOfYearsWorked);
        System.out.println("Location : "+this.location);
        System.out.println("Is satisfied : " +this.isSatisfied);
        System.out.println("=============================================");

        experience.display();

    }

}
