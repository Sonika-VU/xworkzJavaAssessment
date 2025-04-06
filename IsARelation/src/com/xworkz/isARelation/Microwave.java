package com.xworkz.isARelation;

public class Microwave extends Appliance{
    public Microwave() {
        super();
        System.out.println("no-arg const of Microwave");
    }

    @Override
    public void turnOn(){
//        super.turnOn();
        System.out.println("Running turnOn in Microwave");
    }

    @Override
    public void adjustSettings(){
//        super.adjustSettings();
        System.out.println("Running adjustSettings in Microwave");
    }

    @Override
    public void showStatus(){
//        super.showStatus();
        System.out.println("Running showStatus in Microwave");
    }

    @Override
    public void scheduleTask(){
//        super.scheduleTask();
        System.out.println("Running scheduleTask in Microwave");
    }

    @Override
    public void turnOff(){
//        super.turnOff();
        System.out.println("Running turnOff in Microwave");
    }
}
