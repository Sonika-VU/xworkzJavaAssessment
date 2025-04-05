package com.xworkz.isARelation;

public class AirConditioner extends Appliance{
    public AirConditioner() {
        super();
        System.out.println("no-arg const of AirConditioner");
    }

    @Override
    public void turnOn(){
//        super.turnOn();
        System.out.println("Running turnOn in AirConditioner");
    }

    @Override
    public void adjustSettings(){
//        super.adjustSettings();
        System.out.println("Running adjustSettings in AirConditioner");
    }

    @Override
    public void showStatus()
    {
//        super.showStatus();
        System.out.println("Running showStatus in AirConditioner");
    }

    @Override
    public void scheduleTask(){
//        super.scheduleTask();
        System.out.println("Running scheduleTask in AirConditioner");
    }

    @Override
    public void turnOff(){
//        super.turnOff();
        System.out.println("Running turnOff in AirConditioner");
    }
}
