package com.xworkz.isARelation;

public class HighSchool extends School {
    public HighSchool() {
        super();
        System.out.println("no-arg constructor of HighSchool");
    }

    @Override
    public void conductClasses(){
//        super.conductClasses();
        System.out.println("Teaching advanced subjects in High School");
    }

    @Override
    public void organizeSports(){
//        super.organizeSports();
        System.out.println("Organizing High School sports tournaments");
    }

    @Override
    public void takeExams(){
//        super.takeExams();
        System.out.println("Conducting board exams in High School");
    }

    @Override
    public void manageLibrary(){
//        super.manageLibrary();
        System.out.println("Expanding library collection in High School");
    }

    @Override
    public void celebrateEvents(){
//        super.celebrateEvents();
        System.out.println("Hosting graduation ceremony in High School");
    }

    public void getAwards(){
        System.out.println("Running getAwards in HighSchool");
    }
}
