package com.xworkz.isARelation;

public class Stool extends Furniture {
    public Stool() {
        super();
        System.out.println("no-arg const of Stool");
    }

    @Override
    public void assemble() {
//        super.assemble();
        System.out.println("Fixing stool legs to the seat");
    }

    @Override
    public void disassemble() {
//        super.disassemble();
        System.out.println("Removing stool legs for easy storage");
    }

    @Override
    public void clean() {
//        super.clean();
        System.out.println("Wiping stool surface");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Stool moved to kitchen");
    }

    @Override
    public void paint(){
//        super.paint();
        System.out.println("Painting stool in brown");
    }
}
