package com.xworkz.isARelation;

public class Manager extends Employee {
    public Manager() {
        super();
        System.out.println("no-arg const of Manager");
    }

    {
        super.work();
        System.out.println("Running work in Manager");
    }

    {
        super.attendMeetings();
        System.out.println("Running attendMeetings in Manager");
    }

    {
        super.getSalary();
        System.out.println("Running getSalary in Manager");
    }

    {
        super.takeBreak();
        System.out.println("Running takeBreak in Manager");
    }

    {
        super.submitReport();
        System.out.println("Running submitReport in Manager");
    }
}
