package com.xworkz.isARelation.childClasses;

import com.xworkz.isARelation.parentClasses.Animal;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Running makeSound in Cat");
    }
}
