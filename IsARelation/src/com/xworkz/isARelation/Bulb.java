package com.xworkz.isARelation;

public class Bulb extends Light{

    public Bulb(){
        super();
        System.out.println("no-arg const of Bulb");
    }

    @Override
    public void turnOn(){
//        super.turnOn();
        System.out.println("Running turnOn in Light");
    }

    @Override
    public void turnOff(){
//        super.turnOff();
        System.out.println("Running turnOff in Light");
    }

    @Override
    public void displayObject(){
//        super.displayObject();
        System.out.println("Running displayObject in Light");
    }

    @Override
    public void decorate(){
//        super.decorate();
        System.out.println("Running decorate in Light");
    }

    @Override
    public void hangIt(){
//        super.hangIt();
        System.out.println("Running hangIt in Light");
    }
}
