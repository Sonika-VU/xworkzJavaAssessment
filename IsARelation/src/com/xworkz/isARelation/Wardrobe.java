package com.xworkz.isARelation;

public class Wardrobe extends Furniture {
    public Wardrobe() {
        super();
        System.out.println("no-arg const of Wardrobe");
    }

    {
        super.assemble();
        System.out.println("Assembling wardrobe compartments");

        super.disassemble();
        System.out.println("Wardrobe taken apart for relocation");

        super.clean();
        System.out.println("Cleaning wardrobe shelves");

        super.move();
        System.out.println("Moving wardrobe to guest room");

        super.paint();
        System.out.println("Painting wardrobe in white");
    }
}
