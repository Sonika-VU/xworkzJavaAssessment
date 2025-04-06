package com.xworkz.isARelation;

public class Shark extends Fish {
    public Shark() {
        super();
        System.out.println("no-arg const of Shark");
    }

    @Override
    public void swim(){
//        super.swim();
        System.out.println("Running swim in Shark");
    }

    @Override
    public void breatheUnderwater(){
//        super.breatheUnderwater();
        System.out.println("Running breatheUnderwater in Shark");
    }

    @Override
    public void layEggs(){
//        super.layEggs();
        System.out.println("Running layEggs in Shark");
    }

    @Override
    public void findFood(){
//        super.findFood();
        System.out.println("Running findFood in Shark");
    }

    @Override
    public void hide(){
//        super.hide();
        System.out.println("Running hide in Shark");
    }
}
