package com.xworkz.isARelation;

public class BeagleDog extends Dog{

    public BeagleDog(){
        super();
        System.out.println("no-arg const of BeagleDog");
    }

    {
        super.bark();
        System.out.println("Running bark in BeagleDog");
    }

    {
        super.eatsFood();
        System.out.println("Running eatsFood in BeagleDog");
    }

    {
        super.goWalk();
        System.out.println("Running goWalk in BeagleDog");
    }

    {
        super.bite();
        System.out.println("Running bite in BeagleDog");
    }

    {
        super.run();
        System.out.println("Running run in BeagleDog");
    }
}
