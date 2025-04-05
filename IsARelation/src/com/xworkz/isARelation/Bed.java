package com.xworkz.isARelation;

public class Bed extends Furniture {
    public Bed() {
        super();
        System.out.println("no-arg const of Bed");
    }

    @Override
    public void assemble(){
        System.out.println("Fixing bed frame and mattress");
    }

    @Override
    public void disassemble(){
        System.out.println("Disassembling bed for storage");

    }

    @Override
            public void clean() {
        System.out.println("Dusting the bed and cleaning mattress");
    }

    @Override
            public void move() {
        System.out.println("Moving bed to master bedroom");
    }

    @Override
            public void paint() {
        System.out.println("Painting the headboard");
    }
}
