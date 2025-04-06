package com.xworkz.isARelation;

public class Jio extends Reliance{
    public Jio(){
        super();
        System.out.println("no-arg const of Jio");
    }

    @Override
    public void constructOffice(){
//        super.constructOffice();
        System.out.println("Running constructOffice in Jio");
    }

    @Override
    public void getEmployees(){
//        super.getEmployees();
        System.out.println("Running getEmployees in Jio");
    }

    @Override
    public void setSalary(){
//        super.setSalary();
        System.out.println("Running setSalary in Jio");
    }

    @Override
    public void advertise(){
//        super.advertise();
        System.out.println("Running advertise in Jio");
    }

    @Override
    public void setGoals(){
//        super.setGoals();
        System.out.println("Running setGoals in Jio");
    }

}
