package com.xworkz.isARelation;

public class Rose extends Flower{

    public Rose(){
        super();
        System.out.println("no-arg const of Rose");
    }

    @Override
    public void decorate(){
//        super.decorate();
        System.out.println("Running decorate in Rose");
    }

    @Override
    public void garland(){
//        super.garland();
        System.out.println("Running garland in Rose");
    }

    @Override
    public void provideNectar(){
//        super.provideNectar();
        System.out.println("Running provideNectar in Rose ");
    }

    @Override
    public void fell(){
//        super.fell();
        System.out.println("Running fell in Rose");
    }

    @Override
    public void makeDrinks(){
//        super.makeDrinks();
        System.out.println("Running makeDrinks in Rose");
    }
}
