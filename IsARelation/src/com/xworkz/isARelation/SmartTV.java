package com.xworkz.isARelation;

import java.lang.annotation.Documented;

public class SmartTV extends Television {
    public SmartTV() {
        super();
        System.out.println("no-arg const of SmartTV");
    }

    @Override
    public void turnOn(){
//        super.turnOn();
        System.out.println("Running turnOn in SmartTV");
    }

    @Override
    public void changeChannel(){
//        super.changeChannel();
        System.out.println("Running changeChannel in SmartTV");
    }

    @Override
    public void increaseVolume(){
//        super.increaseVolume();
        System.out.println("Running increaseVolume in SmartTV");
    }

    @Override
    public void decreaseVolume(){
        super.decreaseVolume();
        System.out.println("Running decreaseVolume in SmartTV");
    }

    @Override
    public void turnOff(){
//        super.turnOff();
        System.out.println("Running turnOff in SmartTV");
    }
}
