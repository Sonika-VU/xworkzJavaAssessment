package com.xworkz.isARelation;

public class Surgeon extends Doctor {
    public Surgeon() {
        super();
        System.out.println("no-arg const of Surgeon");
    }

    @Override
    public void diagnose(){
//        super.diagnose();
        System.out.println("Running diagnose in Surgeon");
    }

    @Override
    public void prescribeMedicine(){
//        super.prescribeMedicine();
        System.out.println("Running prescribeMedicine in Surgeon");
    }

    @Override
    public void checkVitals(){
//        super.checkVitals();
        System.out.println("Running checkVitals in Surgeon");
    }

    @Override
    public void conductCheckup(){
//        super.conductCheckup();
        System.out.println("Running conductCheckup in Surgeon");
    }

    @Override
    public void giveAdvice(){
//        super.giveAdvice();
        System.out.println("Running giveAdvice in Surgeon");
    }
}
