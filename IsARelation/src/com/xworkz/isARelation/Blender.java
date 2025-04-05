package com.xworkz.isARelation;

public class Blender extends Appliance{

    public Blender() {
        super();
        System.out.println("no-arg const of Blender");
    }

    @Override
    public void turnOn(){
//        super.turnOn();
        System.out.println("Running turnOn in Blender");
    }

    @Override
    public void adjustSettings(){
//        super.adjustSettings();
        System.out.println("Running adjustSettings in Blender");
    }

    @Override
    public void showStatus(){
//        super.showStatus();
        System.out.println("Running showStatus in Blender");
    }

    @Override
    public void scheduleTask(){
//        super.scheduleTask();
        System.out.println("Running scheduleTask in Blender");
    }

    @Override
    public void turnOff(){
//        super.turnOff();
        System.out.println("Running turnOff in Blender");
    }
}
