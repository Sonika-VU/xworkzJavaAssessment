package com.xworkz.isARelation;

public class ActionMovie extends Movie{

    public ActionMovie(){
        super();
        System.out.println("no-arg const of ActionMovie");
    }

    {
        super.direct();
        System.out.println("Running direct in ActionMovie");
    }

    {
        super.produce();
        System.out.println("Running produce in ActionMovie");
    }

    {
        super.act();
        System.out.println("Running act in ActionMovie");
    }

    {
        super.composeSong();
        System.out.println("Running composeSong in ActionMovie");
    }
    {
        super.telecast();
        System.out.println("Running telecast in ActionMovie");
    }

}
