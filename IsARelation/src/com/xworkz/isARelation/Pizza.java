package com.xworkz.isARelation;

public class Pizza extends Food{

    public Pizza(){
        super();
        System.out.println("no-arg const of Pizza");
    }

    {
        super.prepare();
        System.out.println("Running prepare in Pizza");
    }

    {
        super.selectIngredients();
        System.out.println("Running selectIngredients in Pizza");
    }

    {
        super.eat();
        System.out.println("Running eat in Pizza");
    }

    {
        super.cutVeggies();
        System.out.println("Running cutVeggies in Pizza");
    }

    {
        super.serve();
        System.out.println("Running serve in Pizza");
    }
}
