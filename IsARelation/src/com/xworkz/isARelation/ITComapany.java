package com.xworkz.isARelation;

public class ITComapany extends Company{

    public ITComapany(){
        super();
        System.out.println("no-arg const of ITCompany");
    }

    {
        super.hireEmployee();
        System.out.println("Running hireEmployee in Company");
    }

    {
        super.paySalary();
        System.out.println("Running paySalary in Company");
    }

    {
        super.conductMeeting();
        System.out.println("Running conductMeeting in Company");
    }

    {
        super.releaseProduct();
        System.out.println("Running releaseProduct in Company");
    }

    {
        super.handleClient();
        System.out.println("Running handleClient in Company");
    }
}
