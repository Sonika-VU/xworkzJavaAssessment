package com.xworkz.isARelation;

public class Laptop extends Computer {
    public Laptop() {
        super();
        System.out.println("no-arg const of Laptop");
    }

    {
        super.turnOn();
        System.out.println("Running turnOn in Laptop");
    }

    {
        super.processData();
        System.out.println("Running processData in Laptop");
    }

    {
        super.connectToNetwork();
        System.out.println("Running connectToNetwork in Laptop");
    }

    {
        super.installSoftware();
        System.out.println("Running installSoftware in Laptop");
    }

    {
        super.turnOff();
        System.out.println("Running turnOff in Laptop");
    }
}
