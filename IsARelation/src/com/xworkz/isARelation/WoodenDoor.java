package com.xworkz.isARelation;

public class WoodenDoor extends Door {
    public WoodenDoor() {
        super();
        System.out.println("no-arg const of WoodenDoor");
    }

    {
        super.open();
        System.out.println("Running open in WoodenDoor");
    }

    {
        super.close();
        System.out.println("Running close in WoodenDoor");
    }

    {
        super.lock();
        System.out.println("Running lock in WoodenDoor");
    }

    {
        super.unlock();
        System.out.println("Running unlock in WoodenDoor");
    }

    {
        super.provideSecurity();
        System.out.println("Running provideSecurity in WoodenDoor");
    }
}
