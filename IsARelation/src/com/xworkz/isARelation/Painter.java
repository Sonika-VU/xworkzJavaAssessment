package com.xworkz.isARelation;

public class Painter extends Artist {
    public Painter() {
        super();
        System.out.println("no-arg const of Painter");
    }

    @Override
    public  void createArt(){
//        super.createArt();
        System.out.println("Running createArt in Painter");
    }

    @Override
    public void useColors(){
//        super.useColors();
        System.out.println("Running useColors in Painter");
    }

    @Override
    public void sketch(){
//        super.sketch();
        System.out.println("Running sketch in Painter");
    }

    @Override
    public void visualize(){
//        super.visualize();
        System.out.println("Running visualize in Painter");
    }

    @Override
    public void displayArt(){
//        super.displayArt();
        System.out.println("Running displayArt in Painter");
    }
}
