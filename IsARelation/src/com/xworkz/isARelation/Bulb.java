package com.xworkz.isARelation;

public class Bulb extends Light{

    public Bulb(){
        super();
        System.out.println("no-arg const of Bulb");
    }

    {
        super.turnOn();
        System.out.println("Running turnOn in Light");
    }

    {
        super.turnOff();
        System.out.println("Running turnOff in Light");
    }

    {
        super.displayObject();
        System.out.println("Running displayObject in Light");
    }

    {
        super.decorate();
        System.out.println("Running decorate in Light");
    }

    {
        super.hangIt();
        System.out.println("Running hangIt in Light");
    }
}
