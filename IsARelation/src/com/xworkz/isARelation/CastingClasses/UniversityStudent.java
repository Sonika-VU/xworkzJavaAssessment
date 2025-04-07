package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.PublicUniversity;
import com.xworkz.isARelation.University;

public class UniversityStudent {

    public void getAdmission(University university){
        university.organizeSeminars();
        university.conductLectures();
        university.conductResearch();
        university.offerCourses();
        university.provideScholarships();

        if(university instanceof PublicUniversity){
            PublicUniversity publicUniversity = (PublicUniversity) university;
            publicUniversity.underGovt();
        }
    }
}
