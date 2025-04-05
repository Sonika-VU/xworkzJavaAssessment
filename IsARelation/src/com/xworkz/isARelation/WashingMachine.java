package com.xworkz.isARelation;

public class WashingMachine extends Appliance {
    public WashingMachine() {
        super();
        System.out.println("no-arg const of WashingMachine");
    }

    @Override
    public void turnOn(){
//        super.turnOn();
        System.out.println("Running turnOn in WashingMachine");
    }

    @Override
    public  void adjustSettings(){
        super.adjustSettings();
        System.out.println("Running adjustSettings in WashingMachine");
    }

    @Override
    public void showStatus(){
        super.showStatus();
        System.out.println("Running showStatus in WashingMachine");
    }

    @Override
    public  void scheduleTask(){
        super.scheduleTask();
        System.out.println("Running scheduleTask in WashingMachine");
    }

    @Override
    public void turnOff(){
        super.turnOff();
        System.out.println("Running turnOff in WashingMachine");
    }
}
