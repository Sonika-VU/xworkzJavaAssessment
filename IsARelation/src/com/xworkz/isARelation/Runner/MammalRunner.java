package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Mammal;
import com.xworkz.isARelation.Tiger;

public class MammalRunner {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Mammal mammal1  = new Tiger();
        Tiger tiger = new Tiger();

        System.out.println("=======================");
        mammal.communicate();
        mammal.drinkMilk();
        mammal.giveBirth();
        mammal.hunt();
        mammal.walk();

        System.out.println("=======================");
        mammal1.communicate();
        mammal1.drinkMilk();
        mammal1.giveBirth();
        mammal1.hunt();
        mammal1.walk();

        System.out.println("=======================");
        tiger.communicate();
        tiger.drinkMilk();
        tiger.giveBirth();
        tiger.hunt();
        tiger.walk();
    }
}
