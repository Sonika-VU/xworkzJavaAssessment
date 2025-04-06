package com.xworkz.isARelation;

public class DiningTable extends Table {
    public DiningTable() {
        super();
        System.out.println("no-arg const of DiningTable");
    }

    @Override
    public void supportObjects(){
//        super.supportObjects();
        System.out.println("Running supportObjects in DiningTable");
    }

    @Override
    public void provideSurface(){
//        super.provideSurface();
        System.out.println("Running provideSurface in DiningTable");
    }

    @Override
    public void beStable(){
//        super.beStable();
        System.out.println("Running beStable in DiningTable");
    }

    @Override
    public void beMovable(){
//        super.beMovable();
        System.out.println("Running beMovable in DiningTable");
    }

    @Override
    public void beDurable(){
//        super.beDurable();
        System.out.println("Running beDurable in DiningTable");
    }
}
