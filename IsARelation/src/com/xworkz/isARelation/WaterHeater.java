package com.xworkz.isARelation;

public class WaterHeater extends  Appliance{

    public WaterHeater() {
        super();
        System.out.println("no-arg const of WaterHeater");
    }

    @Override
    public void turnOn(){
//        super.turnOn();
        System.out.println("Running turnOn in WaterHeater");
    }

    @Override
    public void adjustSettings(){
//        super.adjustSettings();
        System.out.println("Running adjustSettings in WaterHeater");
    }

    @Override
    public void showStatus(){
//        super.showStatus();
        System.out.println("Running showStatus in WaterHeater");
    }

    @Override
    public void scheduleTask(){
//        super.scheduleTask();
        System.out.println("Running scheduleTask in WaterHeater");
    }

    @Override
    public void turnOff(){
//        super.turnOff();
        System.out.println("Running turnOff in WaterHeater");
    }
}
