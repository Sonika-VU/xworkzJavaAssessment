package com.xworkz.isARelation;

public class Manager extends Employee {
    public Manager() {
        super();
        System.out.println("no-arg const of Manager");
    }

    @Override
    public void work(){
//        super.work();
        System.out.println("Running work in Manager");
    }

    @Override
    public void attendMeetings(){
//        super.attendMeetings();
        System.out.println("Running attendMeetings in Manager");
    }

    @Override
    public void getSalary(){
//        super.getSalary();
        System.out.println("Running getSalary in Manager");
    }

    @Override
    public void takeBreak(){
//        super.takeBreak();
        System.out.println("Running takeBreak in Manager");
    }

    @Override
    public void submitReport(){
//        super.submitReport();
        System.out.println("Running submitReport in Manager");
    }
}
