package com.xworkz.isARelation;

public class Granite extends Rock {
    public Granite() {
        super();
        System.out.println("no-arg const of Granite");
    }

    @Override
    public void formNaturally(){
//        super.formNaturally();
        System.out.println("Running formNaturally in Granite");
    }

    @Override
    public void provideMinerals(){
//        super.provideMinerals();
        System.out.println("Running provideMinerals in Granite");
    }

    @Override
    public void withstandWeather(){
//        super.withstandWeather();
        System.out.println("Running withstandWeather in Granite");
    }

    @Override
    public void supportStructures(){
//        super.supportStructures();
        System.out.println("Running supportStructures in Granite");
    }

    @Override
    public void appearInDifferentShapes(){
//        super.appearInDifferentShapes();
        System.out.println("Running appearInDifferentShapes in Granite");
    }
    public  void makeTile(){
        System.out.println("Running makeTile in Granite");
    }
}
