package com.xworkz.isARelation;

public class Cabinet extends Furniture {
    public Cabinet() {
        super();
        System.out.println("no-arg const of Cabinet");
    }

    {
        super.assemble();
        System.out.println("Fixing cabinet doors and shelves");

        super.disassemble();
        System.out.println("Disassembling cabinet for shifting");

        super.clean();
        System.out.println("Dusting and polishing cabinet surface");

        super.move();
        System.out.println("Moving cabinet to the storage room");

        super.paint();
        System.out.println("Painting cabinet with a dark finish");
    }
}
