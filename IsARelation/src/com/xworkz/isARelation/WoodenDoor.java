package com.xworkz.isARelation;

public class WoodenDoor extends Door {
    public WoodenDoor() {
        super();
        System.out.println("no-arg const of WoodenDoor");
    }

    @Override
    public void open(){
//        super.open();
        System.out.println("Running open in WoodenDoor");
    }

    @Override
    public void close(){
//        super.close();
        System.out.println("Running close in WoodenDoor");
    }

    @Override
    public void lock(){
//        super.lock();
        System.out.println("Running lock in WoodenDoor");
    }

    @Override
    public void unlock(){
//        super.unlock();
        System.out.println("Running unlock in WoodenDoor");
    }



    @Override
    public void provideSecurity(){
//        super.provideSecurity();
        System.out.println("Running provideSecurity in WoodenDoor");
    }

    public void makeDesign(){
        System.out.println("Running makeDesign in WoodenDoor");
    }
}
