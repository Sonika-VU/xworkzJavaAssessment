package com.xworkz.isARelation;

public class Toaster extends  Appliance{

    public Toaster() {
        super();
        System.out.println("no-arg const of Toaster");
    }

    @Override
    public void turnOn(){
//        super.turnOn();
        System.out.println("Running turnOn in Toaster");
    }

    @Override
    public void adjustSettings(){
//        super.adjustSettings();
        System.out.println("Running adjustSettings in Toaster");
    }

    @Override
    public void showStatus(){
//        super.showStatus();
        System.out.println("Running showStatus in Toaster");
    }

    @Override
    public void scheduleTask(){
//        super.scheduleTask();
        System.out.println("Running scheduleTask in Toaster");
    }

    @Override
    public void turnOff(){
//        super.turnOff();
        System.out.println("Running turnOff in Toaster");
    }


}
