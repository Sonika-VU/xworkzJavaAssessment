package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Food;
import com.xworkz.isARelation.Pizza;

public class FoodRunner {
    public static void main(String[] args) {
        Food food = new Food();
        Food food1 = new Pizza();
        Pizza pizza = new Pizza();

        System.out.println("====================");
        food.selectIngredients();
        food.eat();
        food.cutVeggies();
        food.prepare();
        food.serve();

        System.out.println("====================");
        food1.selectIngredients();
        food1.eat();
        food1.cutVeggies();
        food1.prepare();
        food1.serve();

        System.out.println("====================");
        pizza.selectIngredients();
        pizza.eat();
        pizza.cutVeggies();
        pizza.prepare();
        pizza.serve();

    }
}
