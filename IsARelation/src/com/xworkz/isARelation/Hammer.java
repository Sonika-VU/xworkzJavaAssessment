package com.xworkz.isARelation;

public class Hammer extends Tool {

    public Hammer(){
        super();
        System.out.println("no-arg const of Hammer");
    }

    @Override
    public void turnOn(){
//        super.turnOn();
        System.out.println("Running turnOn in Hammer");
    }

    @Override
    public void use(){
//        super.use();
        System.out.println("Running use in Hammer");
    }

    @Override
    public void beat(){
//        super.beat();
        System.out.println("Running beat in Hammer");
    }

    @Override
    public void hold(){
//        super.hold();
        System.out.println("Running hold in Hammer");
    }

    @Override
    public void turnOff(){
//        super.turnOff();
        System.out.println("Running turnOff in Hammer");
    }

}
