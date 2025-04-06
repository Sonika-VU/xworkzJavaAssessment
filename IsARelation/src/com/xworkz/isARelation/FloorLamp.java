package com.xworkz.isARelation;

public class FloorLamp extends Lamp {
    public FloorLamp() {
        super();
        System.out.println("no-arg const of FloorLamp");
    }

    @Override
    public void produceLight(){
//        super.produceLight();
        System.out.println("Running produceLight in FloorLamp");
    }

    @Override
    public void consumeElectricity(){
//        super.consumeElectricity();
        System.out.println("Running consumeElectricity in FloorLamp");
    }

    @Override
    public void haveSwitch(){
//        super.haveSwitch();
        System.out.println("Running haveSwitch in FloorLamp");
    }

    @Override
    public void bePortable(){
//        super.bePortable();
        System.out.println("Running bePortable in FloorLamp");
    }

    @Override
    public void haveBulb(){
//        super.haveBulb();
        System.out.println("Running haveBulb in FloorLamp");
    }
}
