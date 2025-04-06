package com.xworkz.isARelation;

public class Earth extends Planet {
    public Earth() {
        super();
        System.out.println("no-arg const of Earth");
    }

    @Override
    public void rotate(){
//        super.rotate();
        System.out.println("Running rotate in Earth");
    }

    @Override
    public void revolve(){
//        super.revolve();
        System.out.println("Running revolve in Earth");
    }

    @Override
    public void supportLife(){
//        super.supportLife();
        System.out.println("Running supportLife in Earth");
    }

    @Override
    public void hasAtmosphere(){
//        super.hasAtmosphere();
        System.out.println("Running hasAtmosphere in Earth");
    }

    @Override
    public void hasGravity(){
//        super.hasGravity();
        System.out.println("Running hasGravity in Earth");
    }
}
