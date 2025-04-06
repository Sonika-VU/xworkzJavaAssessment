package com.xworkz.isARelation;

public class ITComapany extends Company{

    public ITComapany(){
        super();
        System.out.println("no-arg const of ITCompany");
    }

    @Override
    public void hireEmployee(){
//        super.hireEmployee();
        System.out.println("Running hireEmployee in Company");
    }

    @Override
    public void paySalary(){
//        super.paySalary();
        System.out.println("Running paySalary in Company");
    }

    @Override
    public void conductMeeting(){
//        super.conductMeeting();
        System.out.println("Running conductMeeting in Company");
    }

    @Override
    public void releaseProduct(){
//        super.releaseProduct();
        System.out.println("Running releaseProduct in Company");
    }

    @Override
    public void handleClient(){
//        super.handleClient();
        System.out.println("Running handleClient in Company");
    }
}
