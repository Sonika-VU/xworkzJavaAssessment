package com.xworkz.isARelation;

public class Guitar extends Instrument{

    public Guitar(){
        super();
        System.out.println("no-arg const of Guitar");
    }

    @Override
    public void buy(){
//        super.buy();
        System.out.println("Running buy in Guitar");
    }

    @Override
    public void use(){
//        super.use();
        System.out.println("Running use in Guitar");
    }

    @Override
    public void manufacture(){
//        super.manufacture();
        System.out.println("Running manufacture in Guitar");
    }

    @Override
    public void sell(){
//        super.sell();
        System.out.println("Running sell in Guitar");
    }

    @Override
    public void play(){
//        super.play();
        System.out.println("Running play in Guitar");
    }

    public void compose(){
        System.out.println("Running compose in Guitar");
    }
}
