package com.xworkz.isARelation;

public class Stool extends Furniture {
    public Stool() {
        super();
        System.out.println("no-arg const of Stool");
    }

    {
        super.assemble();
        System.out.println("Fixing stool legs to the seat");

        super.disassemble();
        System.out.println("Removing stool legs for easy storage");

        super.clean();
        System.out.println("Wiping stool surface");

        super.move();
        System.out.println("Stool moved to kitchen");

        super.paint();
        System.out.println("Painting stool in brown");
    }
}
