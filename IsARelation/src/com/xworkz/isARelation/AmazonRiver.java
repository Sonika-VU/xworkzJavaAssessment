package com.xworkz.isARelation;

public class AmazonRiver extends River {
    public AmazonRiver() {
        super();
        System.out.println("no-arg const of AmazonRiver");
    }

    @Override
    public void flow(){
//        super.flow();
        System.out.println("Running flow in AmazonRiver");
    }

    @Override
    public void provideWater(){
//        super.provideWater();
        System.out.println("Running provideWater in AmazonRiver");
    }

    @Override
    public void supportLife(){
//        super.supportLife();
        System.out.println("Running supportLife in AmazonRiver");
    }

    @Override
    public void createValleys(){
//        super.createValleys();
        System.out.println("Running createValleys in AmazonRiver");
    }

    @Override
    public void generateHydroPower(){
//        super.generateHydroPower();
        System.out.println("Running generateHydroPower in AmazonRiver");
    }
}
