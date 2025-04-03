package com.xworkz.isARelation;

public class GovtHospital extends Hospital{

    public GovtHospital(){
        super();
        System.out.println("no-arg const of GovtHospital");
    }

    {
        super.checkPatients();
        System.out.println("Running checkPatients in Hospital");
    }

    {
        super.admitPatients();
        System.out.println("Running admitPatients in Hospital");
    }

    {
        super.surgery();
        System.out.println("Running surgery in Hospital");
    }

    {
        super.issueTablets();
        System.out.println("Running issueTablets in Hospital");
    }

    {
        super.checkEye();
        System.out.println("Running checkEye in Hospital");
    }
}
