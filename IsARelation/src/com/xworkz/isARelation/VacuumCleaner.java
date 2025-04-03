package com.xworkz.isARelation;

public class VacuumCleaner extends Appliance{

    public VacuumCleaner() {
        super();
        System.out.println("no-arg const of VacuumCleaner");
    }

    {
        super.turnOn();
        System.out.println("Running turnOn in VacuumCleaner");
    }

    {
        super.adjustSettings();
        System.out.println("Running adjustSettings in VacuumCleaner");
    }

    {
        super.showStatus();
        System.out.println("Running showStatus in VacuumCleaner");
    }

    {
        super.scheduleTask();
        System.out.println("Running scheduleTask in VacuumCleaner");
    }

    {
        super.turnOff();
        System.out.println("Running turnOff in VacuumCleaner");
    }

}
