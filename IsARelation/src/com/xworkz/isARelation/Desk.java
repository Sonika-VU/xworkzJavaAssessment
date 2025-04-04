package com.xworkz.isARelation;

public class Desk extends Furniture {
    public Desk() {
        super();
        System.out.println("no-arg const of Desk");
    }

    {
        super.assemble();
        System.out.println("Assembling desk with drawers and surface");

        super.disassemble();
        System.out.println("Disassembling desk for transportation");

        super.clean();
        System.out.println("Cleaning desk with a dry cloth");

        super.move();
        System.out.println("Moving desk to study room");

        super.paint();
        System.out.println("Painting desk with a smooth finish");
    }
}
