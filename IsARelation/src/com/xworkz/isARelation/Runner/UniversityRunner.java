package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.PublicUniversity;
import com.xworkz.isARelation.University;

public class UniversityRunner {
    public static void main(String[] args) {
        University university = new University();
        University university1 = new PublicUniversity();
        PublicUniversity publicUniversity = new PublicUniversity();

        System.out.println("========================");
        university.organizeSeminars();
        university.conductLectures();
        university.conductResearch();
        university.offerCourses();
        university.provideScholarships();

        System.out.println("========================");
        university1.organizeSeminars();
        university1.conductLectures();
        university1.conductResearch();
        university1.offerCourses();
        university1.provideScholarships();

        System.out.println("========================");
        publicUniversity.organizeSeminars();
        publicUniversity.conductLectures();
        publicUniversity.conductResearch();
        publicUniversity.offerCourses();
        publicUniversity.provideScholarships();
    }
}
