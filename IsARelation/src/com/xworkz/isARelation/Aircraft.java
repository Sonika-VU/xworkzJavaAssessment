package com.xworkz.isARelation;

public class Aircraft {
    public Aircraft() {
        System.out.println("no-arg const of Aircraft");
    }

    public void takeOff() {
        System.out.println("Running takeOff in Aircraft");
    }

    public void land() {
        System.out.println("Running land in Aircraft");
    }

    public void refuel() {
        System.out.println("Running refuel in Aircraft");
    }

    public void navigate() {
        System.out.println("Running navigate in Aircraft");
    }

    public void maintainAltitude() {
        System.out.println("Running maintainAltitude in Aircraft");
    }
}
