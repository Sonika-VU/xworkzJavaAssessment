package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.HighSchool;
import com.xworkz.isARelation.School;

public class Institute {

    public void runSchool(School school){
        school.celebrateEvents();
        school.conductClasses();
        school.manageLibrary();
        school.organizeSports();
        school.takeExams();

        if(school instanceof HighSchool){
            HighSchool highSchool = (HighSchool) school;
            highSchool.getAwards();
        }
    }
}
