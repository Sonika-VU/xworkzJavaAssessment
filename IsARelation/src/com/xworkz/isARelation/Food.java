package com.xworkz.isARelation;

public class Food {
    public Food(){
        System.out.println("no-arg const of Food");
    }

    public void prepare(){
        System.out.println("Running prepare in Food");
    }

    public void selectIngredients(){
        System.out.println("Running selectIngredients in Food");
    }

    public void eat(){
        System.out.println("Running eat in Food");
    }

    public void cutVeggies(){
        System.out.println("Running cutVeggies in Food");
    }

    public void serve(){
        System.out.println("Running serve in Food");
    }
}
