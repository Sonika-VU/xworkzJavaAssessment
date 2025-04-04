package com.xworkz.isARelation;

public class Bed extends Furniture {
    public Bed() {
        super();
        System.out.println("no-arg const of Bed");
    }

    {
        super.assemble();
        System.out.println("Fixing bed frame and mattress");

        super.disassemble();
        System.out.println("Disassembling bed for storage");

        super.clean();
        System.out.println("Dusting the bed and cleaning mattress");

        super.move();
        System.out.println("Moving bed to master bedroom");

        super.paint();
        System.out.println("Painting the headboard");
    }
}
