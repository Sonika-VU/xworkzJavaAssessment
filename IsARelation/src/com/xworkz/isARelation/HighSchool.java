package com.xworkz.isARelation;

public class HighSchool extends School {
    public HighSchool() {
        super();
        System.out.println("no-arg constructor of HighSchool");
    }

    {
        super.conductClasses();
        System.out.println("Teaching advanced subjects in High School");
    }

    {
        super.organizeSports();
        System.out.println("Organizing High School sports tournaments");
    }

    {
        super.takeExams();
        System.out.println("Conducting board exams in High School");
    }

    {
        super.manageLibrary();
        System.out.println("Expanding library collection in High School");
    }

    {
        super.celebrateEvents();
        System.out.println("Hosting graduation ceremony in High School");
    }
}
