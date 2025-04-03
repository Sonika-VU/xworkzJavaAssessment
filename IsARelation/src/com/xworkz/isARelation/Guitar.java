package com.xworkz.isARelation;

public class Guitar extends Instrument{

    public Guitar(){
        super();
        System.out.println("no-arg const of Guitar");
    }

    {
        super.buy();
        System.out.println("Running buy in Guitar");
    }

    {
        super.use();
        System.out.println("Running use in Guitar");
    }

    {
        super.manufacture();
        System.out.println("Running manufacture in Guitar");
    }

    {
        super.sell();
        System.out.println("Running sell in Guitar");
    }

    {
        super.play();
        System.out.println("Running play in Guitar");
    }
}
