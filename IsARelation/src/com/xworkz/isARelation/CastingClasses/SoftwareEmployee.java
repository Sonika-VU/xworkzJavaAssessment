package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Engineer;
import com.xworkz.isARelation.SoftwareEngineer;

public class SoftwareEmployee {

    public void work(Engineer engineer){
        engineer.analyze();
        engineer.design();
        engineer.manageProjects();
        engineer.problemSolve();
        engineer.testSystems();

        if(engineer instanceof SoftwareEngineer){
            SoftwareEngineer softwareEngineer = (SoftwareEngineer) engineer;
            softwareEngineer.debug();
        }
    }
}
