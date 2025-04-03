package com.xworkz.isARelation;

public class Snake extends Reptile {
    public Snake() {
        super();
        System.out.println("no-arg const of Snake");
    }

    {
        super.crawl();
        System.out.println("Running crawl in Snake");
    }

    {
        super.shedSkin();
        System.out.println("Running shedSkin in Snake");
    }

    {
        super.layEggs();
        System.out.println("Running layEggs in Snake");
    }

    {
        super.regulateBodyTemperature();
        System.out.println("Running regulateBodyTemperature in Snake");
    }

    {
        super.hide();
        System.out.println("Running hide in Snake");
    }
}
