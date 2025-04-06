package com.xworkz.isARelation;

public class Sofa extends Furniture {
    public Sofa() {
        super();
        System.out.println("no-arg const of Sofa");
    }

    @Override
    public void assemble() {
//        super.assemble();
        System.out.println("Assembling sofa with cushions");
    }

    @Override
    public void disassemble() {
//        super.disassemble();
        System.out.println("Sofa disassembled for cleaning");
    }

    @Override
    public void clean() {
//        super.clean();
        System.out.println("Vacuuming the sofa");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Sofa moved to the hall");
    }

    @Override
    public void paint(){
//        super.paint();
        System.out.println("Painting sofa legs");
    }
}
