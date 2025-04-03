package com.xworkz.isARelation;

public class Chair extends Furniture {
    public Chair() {
        super();
        System.out.println("no-arg const of Chair");
    }

    {
        super.assemble();
        System.out.println("Running assemble in Chair");
    }

    {
        super.disassemble();
        System.out.println("Running disassemble in Chair");
    }

    {
        super.clean();
        System.out.println("Running clean in Chair");
    }

    {
        super.move();
        System.out.println("Running move in Chair");
    }

    {
        super.paint();
        System.out.println("Running paint in Chair");
    }
}
