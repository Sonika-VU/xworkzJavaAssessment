package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.HighSchool;
import com.xworkz.isARelation.School;

public class SchoolRunner {
    public static void main(String[] args) {
        School school  = new School();
        School school1 = new HighSchool();
        HighSchool highSchool = new HighSchool();

        System.out.println("==========================");
        school.celebrateEvents();
        school.conductClasses();
        school.manageLibrary();
        school.organizeSports();
        school.takeExams();

        System.out.println("==========================");
        school1.celebrateEvents();
        school1.conductClasses();
        school1.manageLibrary();
        school1.organizeSports();
        school1.takeExams();

        System.out.println("==========================");
        highSchool.celebrateEvents();
        highSchool.conductClasses();
        highSchool.manageLibrary();
        highSchool.organizeSports();
        highSchool.takeExams();
    }
}
