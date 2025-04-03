package com.xworkz.isARelation;

public class PublicUniversity extends University {
    public PublicUniversity() {
        super();
        System.out.println("no-arg constructor of PublicUniversity");
    }

    {
        super.conductLectures();
        System.out.println("Providing affordable education in Public University");
    }

    {
        super.organizeSeminars();
        System.out.println("Organizing free academic seminars in Public University");
    }

    {
        super.conductResearch();
        System.out.println("Conducting government-funded research in Public University");
    }

    {
        super.provideScholarships();
        System.out.println("Offering scholarships to financially weaker students in Public University");
    }

    {
        super.offerCourses();
        System.out.println("Providing a wide range of courses in Public University");
    }
}
