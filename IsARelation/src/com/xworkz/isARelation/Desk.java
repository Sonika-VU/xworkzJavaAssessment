package com.xworkz.isARelation;

public class Desk extends Furniture {
    public Desk() {
        super();
        System.out.println("no-arg const of Desk");
    }

    @Override
    public void assemble() {
//        super.assemble();
        System.out.println("Assembling desk with drawers and surface");
    }

    @Override
    public void disassemble() {
        super.disassemble();
        System.out.println("Disassembling desk for transportation");
    }

    @Override
    public void clean() {
//        super.clean();
        System.out.println("Cleaning desk with a dry cloth");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Moving desk to study room");
    }

    @Override
    public  void paint(){
//        super.paint();
        System.out.println("Painting desk with a smooth finish");
    }
}
