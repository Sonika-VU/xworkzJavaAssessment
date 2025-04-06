package com.xworkz.isARelation;

public class Wardrobe extends Furniture {
    public Wardrobe() {
        super();
        System.out.println("no-arg const of Wardrobe");
    }

    @Override
    public void assemble() {
//        super.assemble();
        System.out.println("Assembling wardrobe compartments");
    }

    @Override
    public void disassemble() {
//        super.disassemble();
        System.out.println("Wardrobe taken apart for relocation");
    }

    @Override
    public void clean() {
//        super.clean();
        System.out.println("Cleaning wardrobe shelves");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Moving wardrobe to guest room");
    }

    @Override
    public void paint(){
//        super.paint();
        System.out.println("Painting wardrobe in white");
    }
}
