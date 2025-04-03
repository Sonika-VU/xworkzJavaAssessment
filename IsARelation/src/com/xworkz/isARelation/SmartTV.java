package com.xworkz.isARelation;

public class SmartTV extends Television {
    public SmartTV() {
        super();
        System.out.println("no-arg const of SmartTV");
    }

    {
        super.turnOn();
        System.out.println("Running turnOn in SmartTV");
    }

    {
        super.changeChannel();
        System.out.println("Running changeChannel in SmartTV");
    }

    {
        super.increaseVolume();
        System.out.println("Running increaseVolume in SmartTV");
    }

    {
        super.decreaseVolume();
        System.out.println("Running decreaseVolume in SmartTV");
    }

    {
        super.turnOff();
        System.out.println("Running turnOff in SmartTV");
    }
}
