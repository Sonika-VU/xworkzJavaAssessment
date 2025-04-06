package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Engineer;
import com.xworkz.isARelation.SoftwareEngineer;

public class EngineerRunner {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        Engineer engineer1 = new SoftwareEngineer();
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();

        System.out.println("=====================");
        engineer.analyze();
        engineer.design();
        engineer.manageProjects();
        engineer.problemSolve();
        engineer.testSystems();

        System.out.println("=====================");
        engineer1.analyze();
        engineer1.design();
        engineer1.manageProjects();
        engineer1.problemSolve();
        engineer1.testSystems();


        System.out.println("=====================");
        softwareEngineer.analyze();
        softwareEngineer.design();
        softwareEngineer.manageProjects();
        softwareEngineer.problemSolve();
        softwareEngineer.testSystems();
    }
}
