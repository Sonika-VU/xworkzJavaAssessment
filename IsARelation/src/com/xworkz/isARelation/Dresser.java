package com.xworkz.isARelation;

public class Dresser extends Furniture {
    public Dresser() {
        super();
        System.out.println("no-arg const of Dresser");
    }

    {
        super.assemble();
        System.out.println("Attaching dresser drawers and mirror");

        super.disassemble();
        System.out.println("Disassembling dresser for easy moving");

        super.clean();
        System.out.println("Cleaning dresser with wood polish");

        super.move();
        System.out.println("Moving dresser to the bedroom");

        super.paint();
        System.out.println("Painting dresser with a fresh coat");
    }
}
