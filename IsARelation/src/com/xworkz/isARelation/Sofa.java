package com.xworkz.isARelation;

public class Sofa extends Furniture {
    public Sofa() {
        super();
        System.out.println("no-arg const of Sofa");
    }

    {
        super.assemble();
        System.out.println("Assembling sofa with cushions");

        super.disassemble();
        System.out.println("Sofa disassembled for cleaning");

        super.clean();
        System.out.println("Vacuuming the sofa");

        super.move();
        System.out.println("Sofa moved to the hall");

        super.paint();
        System.out.println("Painting sofa legs");
    }
}
