package com.xworkz.isARelation;

public class Dresser extends Furniture {
    public Dresser() {
        super();
        System.out.println("no-arg const of Dresser");
    }

    @Override
    public void assemble() {
//        super.assemble();
        System.out.println("Attaching dresser drawers and mirror");
    }

    @Override
    public void disassemble() {
//        super.disassemble();
        System.out.println("Disassembling dresser for easy moving");
    }

    @Override
    public void clean() {
//        super.clean();
        System.out.println("Cleaning dresser with wood polish");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Moving dresser to the bedroom");
    }

    @Override
    public void paint(){
//        super.paint();
        System.out.println("Painting dresser with a fresh coat");
    }
}
