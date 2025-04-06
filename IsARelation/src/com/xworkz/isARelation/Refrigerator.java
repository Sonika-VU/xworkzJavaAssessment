package com.xworkz.isARelation;

public class Refrigerator extends Appliance {

    public Refrigerator() {
        super();
        System.out.println("no-arg const of Refrigerator");
    }

    @Override
    public void turnOn(){
//        super.turnOn();
        System.out.println("Running turnOn in Refrigerator");
    }

    @Override
    public void adjustSettings(){
//        super.adjustSettings();
        System.out.println("Running adjustSettings in Refrigerator");
    }

    @Override
    public void showStatus(){
//        super.showStatus();
        System.out.println("Running showStatus in Refrigerator");
    }

    @Override
    public void scheduleTask(){
        super.scheduleTask();
        System.out.println("Running scheduleTask in Refrigerator");
    }

    @Override
    public void turnOff(){
        super.turnOff();
        System.out.println("Running turnOff in Refrigerator");
    }
}
