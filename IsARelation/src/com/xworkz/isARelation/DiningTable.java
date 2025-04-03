package com.xworkz.isARelation;

public class DiningTable extends Table {
    public DiningTable() {
        super();
        System.out.println("no-arg const of DiningTable");
    }

    {
        super.supportObjects();
        System.out.println("Running supportObjects in DiningTable");
    }

    {
        super.provideSurface();
        System.out.println("Running provideSurface in DiningTable");
    }

    {
        super.beStable();
        System.out.println("Running beStable in DiningTable");
    }

    {
        super.beMovable();
        System.out.println("Running beMovable in DiningTable");
    }

    {
        super.beDurable();
        System.out.println("Running beDurable in DiningTable");
    }
}
