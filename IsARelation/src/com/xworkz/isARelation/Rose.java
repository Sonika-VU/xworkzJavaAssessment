package com.xworkz.isARelation;

public class Rose extends Flower{

    public Rose(){
        super();
        System.out.println("no-arg const of Rose");
    }

    {
        super.decorate();
        System.out.println("Running decorate in Rose");
    }

    {
        super.garland();
        System.out.println("Running garland in Rose");
    }

    {
        super.provideNectar();
        System.out.println("Running provideNectar in Rose ");
    }

    {
        super.fell();
        System.out.println("Running fell in Rose");
    }

    {
        super.makeDrinks();
        System.out.println("Running makeDrinks in Rose");
    }
}
