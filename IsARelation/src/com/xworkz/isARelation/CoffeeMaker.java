package com.xworkz.isARelation;

public class CoffeeMaker extends  Appliance{

    public CoffeeMaker() {
        super();
        System.out.println("no-arg const of CoffeeMaker");
    }

    @Override
    public void turnOn(){
//        super.turnOn();
        System.out.println("Running turnOn in CoffeeMaker");
    }

    @Override
    public void adjustSettings(){
//        super.adjustSettings();
        System.out.println("Running adjustSettings in CoffeeMaker");
    }

    @Override
    public  void showStatus(){
//        super.showStatus();
        System.out.println("Running showStatus in CoffeeMaker");
    }

    @Override
    public void scheduleTask(){
//        super.scheduleTask();
        System.out.println("Running scheduleTask in CoffeeMaker");
    }

    @Override
    public void turnOff(){
//        super.turnOff();
        System.out.println("Running turnOff in CoffeeMaker");
    }

}
