package com.xworkz.isARelation;

public class GovtHospital extends Hospital{

    public GovtHospital(){
        super();
        System.out.println("no-arg const of GovtHospital");
    }

    @Override
    public void checkPatients(){
//        super.checkPatients();
        System.out.println("Running checkPatients in Hospital");
    }

    @Override
    public void admitPatients(){
//        super.admitPatients();
        System.out.println("Running admitPatients in Hospital");
    }

    @Override
    public void surgery(){
//        super.surgery();
        System.out.println("Running surgery in Hospital");
    }

    @Override
    public void issueTablets(){
//        super.issueTablets();
        System.out.println("Running issueTablets in Hospital");
    }

    @Override
    public void checkEye(){
//        super.checkEye();
        System.out.println("Running checkEye in Hospital");
    }
}
