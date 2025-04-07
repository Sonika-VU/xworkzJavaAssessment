package com.xworkz.isARelation;

public class Laptop extends Computer {
    public Laptop() {
        super();
        System.out.println("no-arg const of Laptop");
    }

    @Override
    public void turnOn(){
//        super.turnOn();
        System.out.println("Running turnOn in Laptop");
    }

    @Override
    public void processData(){
//        super.processData();
        System.out.println("Running processData in Laptop");
    }

    @Override
    public void connectToNetwork(){
//        super.connectToNetwork();
        System.out.println("Running connectToNetwork in Laptop");
    }

    @Override
    public void installSoftware(){
//        super.installSoftware();
        System.out.println("Running installSoftware in Laptop");
    }

    @Override
    public void turnOff(){
        super.turnOff();
        System.out.println("Running turnOff in Laptop");
    }

    public void editExcel(){
        System.out.println("Running editExcel in Laptop");
    }
}
