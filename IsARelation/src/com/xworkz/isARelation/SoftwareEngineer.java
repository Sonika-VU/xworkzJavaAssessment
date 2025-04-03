package com.xworkz.isARelation;

public class SoftwareEngineer extends Engineer {
    public SoftwareEngineer() {
        super();
        System.out.println("no-arg const of SoftwareEngineer");
    }

    {
        super.design();
        System.out.println("Running design in SoftwareEngineer");
    }

    {
        super.analyze();
        System.out.println("Running analyze in SoftwareEngineer");
    }

    {
        super.problemSolve();
        System.out.println("Running problemSolve in SoftwareEngineer");
    }

    {
        super.manageProjects();
        System.out.println("Running manageProjects in SoftwareEngineer");
    }

    {
        super.testSystems();
        System.out.println("Running testSystems in SoftwareEngineer");
    }
}
