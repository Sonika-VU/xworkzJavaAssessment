package com.xworkz.isARelation;

public class Painter extends Artist {
    public Painter() {
        super();
        System.out.println("no-arg const of Painter");
    }

    {
        super.createArt();
        System.out.println("Running createArt in Painter");
    }

    {
        super.useColors();
        System.out.println("Running useColors in Painter");
    }

    {
        super.sketch();
        System.out.println("Running sketch in Painter");
    }

    {
        super.visualize();
        System.out.println("Running visualize in Painter");
    }

    {
        super.displayArt();
        System.out.println("Running displayArt in Painter");
    }
}
