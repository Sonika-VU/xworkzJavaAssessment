package com.xworkz.isARelation;

public class ActionMovie extends Movie{

    public ActionMovie(){
        super();
        System.out.println("no-arg const of ActionMovie");
    }

    @Override
    public void direct(){
//        super.direct();
        System.out.println("Running direct in ActionMovie");
    }

    @Override
    public void produce(){
//        super.produce();
        System.out.println("Running produce in ActionMovie");
    }

    @Override
    public void act(){
//        super.act();
        System.out.println("Running act in ActionMovie");
    }

    @Override
    public void composeSong(){
//        super.composeSong();
        System.out.println("Running composeSong in ActionMovie");
    }

    @Override
    public void telecast(){
//        super.telecast();
        System.out.println("Running telecast in ActionMovie");
    }

    public void addFight(){
        System.out.println("Running addFight in ActionMovie");
    }

}
