package com.xworkz.isARelation;

public class BeagleDog extends Dog{

    public BeagleDog(){
        super();
        System.out.println("no-arg const of BeagleDog");
    }

    @Override
    public  void bark(){
//        super.bark();
        System.out.println("Running bark in BeagleDog");
    }

    @Override
    public void eatsFood(){
//        super.eatsFood();
        System.out.println("Running eatsFood in BeagleDog");
    }

    @Override
    public void goWalk(){
//        super.goWalk();
        System.out.println("Running goWalk in BeagleDog");
    }

    @Override
    public void bite(){
//        super.bite();
        System.out.println("Running bite in BeagleDog");
    }

    @Override
    public void run(){
//        super.run();
        System.out.println("Running run in BeagleDog");
    }

    public void jump(){
        System.out.println("Running jump in BeagleDog");
    }
}
