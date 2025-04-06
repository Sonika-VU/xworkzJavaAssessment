package com.xworkz.isARelation;

public class Tiger extends Mammal {
    public Tiger() {
        super();
        System.out.println("no-arg const of Tiger");
    }

    @Override
    public void walk(){
//        super.walk();
        System.out.println("Running walk in Tiger");
    }

    @Override
    public void giveBirth(){
//        super.giveBirth();
        System.out.println("Running giveBirth in Tiger");
    }

    @Override
    public void drinkMilk(){
//        super.drinkMilk();
        System.out.println("Running drinkMilk in Tiger");
    }

    @Override
    public void communicate(){
//        super.communicate();
        System.out.println("Running communicate in Tiger");
    }

    @Override
    public void hunt(){
//        super.hunt();
        System.out.println("Running hunt in Tiger");
    }
}
