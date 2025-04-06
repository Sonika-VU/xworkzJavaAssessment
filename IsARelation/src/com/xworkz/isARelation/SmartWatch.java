package com.xworkz.isARelation;

public class SmartWatch extends Watch {

    public SmartWatch(){
        super();
        System.out.println("no-arg const of SmartWatch");
    }

    @Override
    public void showTime(){
//        super.showTime();
        System.out.println("Running showTime in SmartWatch");
    }

    @Override
    public void setAlarm(){
//        super.setAlarm();
        System.out.println("Running setAlarm in SmartWatch");
    }

    @Override
    public void hangOnWall(){
//        super.hangOnWall();
        System.out.println("Running hangOnWall in SmartWatch");
    }

    @Override
    public void tieOnWrist(){
//        super.tieOnWrist();
        System.out.println("Running tieOnWrist in SmartWatch");
    }

    @Override
    public void checkPulseRate(){
//        super.checkPulseRate();
        System.out.println("Running checkPulseRate in SmartWatch");
    }
}
