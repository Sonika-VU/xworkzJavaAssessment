package com.xworkz.isARelation;

public class VacuumCleaner extends Appliance{

    public VacuumCleaner() {
        super();
        System.out.println("no-arg const of VacuumCleaner");
    }

    @Override
    public void turnOn(){
//        super.turnOn();
        System.out.println("Running turnOn in VacuumCleaner");
    }

    @Override
    public void adjustSettings(){
//        super.adjustSettings();
        System.out.println("Running adjustSettings in VacuumCleaner");
    }

    @Override
    public void showStatus(){
//        super.showStatus();
        System.out.println("Running showStatus in VacuumCleaner");
    }

    @Override
    public void scheduleTask(){
//        super.scheduleTask();
        System.out.println("Running scheduleTask in VacuumCleaner");
    }

    @Override
    public void turnOff(){
//        super.turnOff();
        System.out.println("Running turnOff in VacuumCleaner");
    }

}
