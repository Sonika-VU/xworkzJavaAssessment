package com.xworkz.RefAndVar.EducationDetails;

public class ExperienceDetail {
    String personName;
    String skillType;
    int years;
    String companyName;

    ExperienceDetail(String personName, String skillType, String company, int years){
        this.personName = personName;
        this.skillType = skillType;
        this.companyName = companyName;
        this.years = years;
    }

    Company company = new Company("Infosys", "Salil Parekh",1981, 90000);
    Education education1 = new Education("BE", "GMIT", 9.5, 2025);
    Education education2 = new Education("M.Tech", "GMU", 9, 2025);
    Education[] educations = {education1, education2};

    void  display(){
        System.out.println("In ExperienceDetail : ");
        System.out.println("Person Name  : "+this.personName);
        System.out.println("Skill Type : "+ this.skillType);
        System.out.println("Company : "+this.companyName);
        System.out.println("Years : "+this.years);
        System.out.println("==================================");

        company.display();
        for (Education education : educations){
            education.diaplay();
        }
    }
}
