package com.xworkz.isARelation;

public class Kettle extends  Appliance{

    public Kettle() {
        super();
        System.out.println("no-arg const of Kettle");
    }

    @Override
    public void turnOn(){
//        super.turnOn();
        System.out.println("Running turnOn in Kettle");
    }

    @Override
    public void adjustSettings(){
//        super.adjustSettings();
        System.out.println("Running adjustSettings in Kettle");
    }

    @Override
    public void showStatus(){
//        super.showStatus();
        System.out.println("Running showStatus in Kettle");
    }

    @Override
    public void scheduleTask(){
//        super.scheduleTask();
        System.out.println("Running scheduleTask in Kettle");
    }

    @Override
    public void turnOff(){
//        super.turnOff();
        System.out.println("Running turnOff in Kettle");
    }
}
