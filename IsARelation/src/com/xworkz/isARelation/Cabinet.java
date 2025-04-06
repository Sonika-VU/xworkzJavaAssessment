package com.xworkz.isARelation;

public class Cabinet extends Furniture {
    public Cabinet() {
        super();
        System.out.println("no-arg const of Cabinet");
    }

    @Override
    public void assemble() {
//        super.assemble();
        System.out.println("Fixing cabinet doors and shelves");
    }


    @Override
    public void disassemble() {
//        super.disassemble();
        System.out.println("Disassembling cabinet for shifting");
    }

    @Override
    public void clean() {
//        super.clean();
        System.out.println("Dusting and polishing cabinet surface");
    }


    @Override
    public void move() {
//        super.move();
        System.out.println("Moving cabinet to the storage room");
    }

    @Override
    public void paint(){
//        super.paint();
        System.out.println("Painting cabinet with a dark finish");
    }
}
