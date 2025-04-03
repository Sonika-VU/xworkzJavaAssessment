package com.xworkz.isARelation;

public class Jio extends Reliance{
    public Jio(){
        super();
        System.out.println("no-arg const of Jio");
    }

    {
        super.constructOffice();
        System.out.println("Running constructOffice in Jio");
    }

    {
        super.getEmployees();
        System.out.println("Running getEmployees in Jio");
    }

    {
        super.setSalary();
        System.out.println("Running setSalary in Jio");
    }

    {
        super.advertise();
        System.out.println("Running advertise in Jio");
    }

    {
        super.setGoals();
        System.out.println("Running setGoals in Jio");
    }

}
