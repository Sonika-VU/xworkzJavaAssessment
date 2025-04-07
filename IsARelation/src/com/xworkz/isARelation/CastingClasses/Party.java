package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Food;
import com.xworkz.isARelation.Pizza;

public class Party {

    public void enjoyFood(Food food){
        food.selectIngredients();
        food.eat();
        food.cutVeggies();
        food.prepare();
        food.serve();

        if(food instanceof Pizza){
            Pizza pizza = (Pizza) food;
            pizza.cut();
        }
    }
}
