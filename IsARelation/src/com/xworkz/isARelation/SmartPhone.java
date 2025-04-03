package com.xworkz.isARelation;

public class SmartPhone extends Mobile {
    public SmartPhone(){
        super();
        System.out.println("no-arg const of SmartPhone");
    }

    {
        super.makeCall();
        System.out.println("Running makeCall in SmartPhone");
    }

    {
        super.sendSMS();
        System.out.println("Running sendSMS in SmartPhone");
    }

    {
        super.sendSMS();
        System.out.println("Running playGame in SmartPhone");
    }

    {
        super.capturePhoto();
        System.out.println("Running capturePhoto in SmartPhone");
    }

    {
        super.setAlarm();
        System.out.println("Running setAlarm in SmartPhone");
    }
}
