package com.xworkz.RefAndVar.EducationDetails;

public class Experience {

    String skillType;
    int years;
    String location;
    String company;

    Experience(String skillType, int years, String location, String company){
        this.skillType = skillType;
        this.years = years;
        this.location = location;
        this.company = company;
    }

    ExperienceDetail experienceDetail = new ExperienceDetail("Yatish", "Python Backend", "Amazon", 10);

    void display(){
        System.out.println("In Experience : ");
        System.out.println("Skill type : " + this.skillType);
        System.out.println("Years : "+this.years);
        System.out.println("Location : "+this.location);
        System.out.println("Company : "+this.company);
        System.out.println("===================================");

        experienceDetail.display();
    }

}
