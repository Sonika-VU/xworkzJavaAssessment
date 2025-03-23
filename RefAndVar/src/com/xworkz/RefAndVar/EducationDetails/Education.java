package com.xworkz.RefAndVar.EducationDetails;

public class Education {
    String qualification;
    String instituteName;
    double gpa;
    int yop;

    Education(String qualification, String instituteName, double gpa, int yop){
        this.qualification = qualification;
        this.instituteName = instituteName;
        this.gpa = gpa;
        this.yop = yop;
    }

    void diaplay(){
        System.out.println("In Education :");
        System.out.println("Qualification : "+this.qualification);
        System.out.println("Institute Name :"+this.instituteName);
        System.out.println("GPA : "+this.gpa);
        System.out.println("YOP : "+this.yop);
        System.out.println("======================================");


    }

}
