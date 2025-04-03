package com.xworkz.isARelation;

public class SmartWatch extends Watch {

    public SmartWatch(){
        super();
        System.out.println("no-arg const of SmartWatch");
    }

    {
        super.showTime();
        System.out.println("Running showTime in SmartWatch");
    }

    {
        super.setAlarm();
        System.out.println("Running setAlarm in SmartWatch");
    }

    {
        super.hangOnWall();
        System.out.println("Running hangOnWall in SmartWatch");
    }

    {
        super.tieOnWrist();
        System.out.println("Running tieOnWrist in SmartWatch");
    }

    {
        super.checkPulseRate();
        System.out.println("Running checkPulseRate in SmartWatch");
    }
}
