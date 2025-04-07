package com.xworkz.isARelation;

public class SmartPhone extends Mobile {
    public SmartPhone(){
        super();
        System.out.println("no-arg const of SmartPhone");
    }

    @Override
    public void makeCall(){
//        super.makeCall();
        System.out.println("Running makeCall in SmartPhone");
    }

    @Override
    public void sendSMS(){
//        super.sendSMS();
        System.out.println("Running sendSMS in SmartPhone");
    }

    @Override
    public void playGame(){
//        super.sendSMS();
        System.out.println("Running playGame in SmartPhone");
    }

    @Override
    public void capturePhoto(){
//        super.capturePhoto();
        System.out.println("Running capturePhoto in SmartPhone");
    }

    @Override
    public void setAlarm(){
//        super.setAlarm();
        System.out.println("Running setAlarm in SmartPhone");
    }

    public void setRemainder(){
        System.out.println("Running setRemainder in SmartPhone");
    }
}
