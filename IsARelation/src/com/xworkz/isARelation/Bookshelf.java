package com.xworkz.isARelation;

public class Bookshelf extends Furniture {
    public Bookshelf() {
        super();
        System.out.println("no-arg const of Bookshelf");
    }

    {
        super.assemble();
        System.out.println("Assembling bookshelf with multiple sections");

        super.disassemble();
        System.out.println("Disassembling bookshelf for relocation");

        super.clean();
        System.out.println("Cleaning bookshelf and organizing books");

        super.move();
        System.out.println("Moving bookshelf to the study");

        super.paint();
        System.out.println("Painting bookshelf in a glossy finish");
    }
}
