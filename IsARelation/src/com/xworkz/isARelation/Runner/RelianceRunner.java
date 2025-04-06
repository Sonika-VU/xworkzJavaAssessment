package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Jio;
import com.xworkz.isARelation.Reliance;

public class RelianceRunner {
    public static void main(String[] args) {
        Reliance reliance = new Reliance();
        Reliance reliance1 = new Jio();
        Jio jio = new Jio();

        System.out.println("====================");
        reliance.advertise();
        reliance.constructOffice();
        reliance.getEmployees();
        reliance.setGoals();
        reliance.setSalary();

        System.out.println("====================");
        reliance1.advertise();
        reliance1.constructOffice();
        reliance1.getEmployees();
        reliance1.setGoals();
        reliance1.setSalary();

        System.out.println("====================");
        jio.advertise();
        jio.constructOffice();
        jio.getEmployees();
        jio.setGoals();
        jio.setSalary();
    }
}
