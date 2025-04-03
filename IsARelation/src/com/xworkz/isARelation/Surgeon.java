package com.xworkz.isARelation;

public class Surgeon extends Doctor {
    public Surgeon() {
        super();
        System.out.println("no-arg const of Surgeon");
    }

    {
        super.diagnose();
        System.out.println("Running diagnose in Surgeon");
    }

    {
        super.prescribeMedicine();
        System.out.println("Running prescribeMedicine in Surgeon");
    }

    {
        super.checkVitals();
        System.out.println("Running checkVitals in Surgeon");
    }

    {
        super.conductCheckup();
        System.out.println("Running conductCheckup in Surgeon");
    }

    {
        super.giveAdvice();
        System.out.println("Running giveAdvice in Surgeon");
    }
}
