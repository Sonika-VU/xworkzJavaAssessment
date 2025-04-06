package com.xworkz.isARelation;

public class DishWasher extends  Appliance {

    public DishWasher() {
        super();
        System.out.println("no-arg const of DishWasher");
    }

    @Override
    public void turnOn(){
//        super.turnOn();
        System.out.println("Running turnOn in DishWasher");
    }

    @Override
    public void adjustSettings(){
//        super.adjustSettings();
        System.out.println("Running adjustSettings in DishWasher");
    }

    @Override
    public void showStatus(){
//        super.showStatus();
        System.out.println("Running showStatus in DishWasher");
    }

    @Override
    public void scheduleTask(){
//        super.scheduleTask();
        System.out.println("Running scheduleTask in DishWasher");
    }

    @Override
    public void turnOff(){
//        super.turnOff();
        System.out.println("Running turnOff in DishWasher");
    }
}
