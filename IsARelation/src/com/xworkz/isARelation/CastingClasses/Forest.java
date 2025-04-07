package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Mammal;
import com.xworkz.isARelation.Tiger;

public class Forest {

    public void protectAnimals(Mammal mammal){
        mammal.communicate();
        mammal.drinkMilk();
        mammal.giveBirth();
        mammal.hunt();
        mammal.walk();

        if(mammal instanceof Tiger){
            Tiger tiger = (Tiger) mammal;
            tiger.roar();
        }
    }
}
