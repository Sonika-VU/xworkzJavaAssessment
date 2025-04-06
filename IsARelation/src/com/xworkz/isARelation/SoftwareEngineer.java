package com.xworkz.isARelation;

public class SoftwareEngineer extends Engineer {
    public SoftwareEngineer() {
        super();
        System.out.println("no-arg const of SoftwareEngineer");
    }

    @Override
    public void design(){
//        super.design();
        System.out.println("Running design in SoftwareEngineer");
    }

    @Override
    public void analyze(){
//        super.analyze();
        System.out.println("Running analyze in SoftwareEngineer");
    }

    @Override
    public void problemSolve(){
//        super.problemSolve();
        System.out.println("Running problemSolve in SoftwareEngineer");
    }

    @Override
    public void manageProjects(){
//        super.manageProjects();
        System.out.println("Running manageProjects in SoftwareEngineer");
    }

    @Override
    public void testSystems(){
//        super.testSystems();
        System.out.println("Running testSystems in SoftwareEngineer");
    }
}
