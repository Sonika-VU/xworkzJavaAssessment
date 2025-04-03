package com.xworkz.isARelation;

public class Hammer extends Tool {

    public Hammer(){
        super();
        System.out.println("no-arg const of Hammer");
    }

    {
        super.turnOn();
        System.out.println("Running turnOn in Hammer");
    }

    {
        super.use();
        System.out.println("Running use in Hammer");
    }

    {
        super.beat();
        System.out.println("Running beat in Hammer");
    }

    {
        super.hold();
        System.out.println("Running hold in Hammer");
    }
    {
        super.turnOff();
        System.out.println("Running turnOff in Hammer");
    }

}
