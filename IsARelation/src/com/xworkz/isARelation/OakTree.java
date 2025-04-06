package com.xworkz.isARelation;

public class OakTree extends Tree {
    public OakTree() {
        super();
        System.out.println("no-arg const of OakTree");
    }

    @Override
    public void grow(){
//        super.grow();
        System.out.println("Running grow in OakTree");
    }

    @Override
    public void provideOxygen(){
//        super.provideOxygen();
        System.out.println("Running provideOxygen in OakTree");
    }

    @Override
    public void absorbWater(){
//        super.absorbWater();
        System.out.println("Running absorbWater in OakTree");
    }

    @Override
    public void shedLeaves(){
//        super.shedLeaves();
        System.out.println("Running shedLeaves in OakTree");
    }

    @Override
    public void bearFruit(){
//        super.bearFruit();
        System.out.println("Running bearFruit in OakTree");
    }
}
