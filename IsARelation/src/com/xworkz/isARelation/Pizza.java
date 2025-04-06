package com.xworkz.isARelation;

public class Pizza extends Food{

    public Pizza(){
        super();
        System.out.println("no-arg const of Pizza");
    }

    @Override
    public void prepare(){
//        super.prepare();
        System.out.println("Running prepare in Pizza");
    }

    @Override
    public void selectIngredients(){
//        super.selectIngredients();
        System.out.println("Running selectIngredients in Pizza");
    }

    @Override
    public void eat(){
//        super.eat();
        System.out.println("Running eat in Pizza");
    }

    @Override
    public void cutVeggies(){
//        super.cutVeggies();
        System.out.println("Running cutVeggies in Pizza");
    }

    @Override
    public void serve(){
//        super.serve();
        System.out.println("Running serve in Pizza");
    }
}
