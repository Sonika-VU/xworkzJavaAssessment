package com.xworkz.isARelation;

public class PublicUniversity extends University {
    public PublicUniversity() {
        super();
        System.out.println("no-arg constructor of PublicUniversity");
    }

    @Override
    public void conductLectures(){
//        super.conductLectures();
        System.out.println("Providing affordable education in Public University");
    }

    @Override
    public void organizeSeminars(){
//        super.organizeSeminars();
        System.out.println("Organizing free academic seminars in Public University");
    }

    @Override
    public void conductResearch(){
//        super.conductResearch();
        System.out.println("Conducting government-funded research in Public University");
    }

    @Override
    public void provideScholarships(){
//        super.provideScholarships();
        System.out.println("Offering scholarships to financially weaker students in Public University");
    }

    @Override
    public void offerCourses(){
//        super.offerCourses();
        System.out.println("Providing a wide range of courses in Public University");
    }

    public void underGovt(){
        System.out.println("Running underGovt in Public University");
    }
}
