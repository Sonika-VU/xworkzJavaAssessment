package com.xworkz.isARelation;

public class Chair extends Furniture {
    public Chair() {
        super();
        System.out.println("no-arg const of Chair");
    }

    @Override
    public void assemble(){
//        super.assemble();
        System.out.println("Running assemble in Chair");
    }

    @Override
    public void disassemble(){
//        super.disassemble();
        System.out.println("Running disassemble in Chair");
    }

    @Override
    public void clean(){
//        super.clean();
        System.out.println("Running clean in Chair");
    }

    @Override
    public void move(){
//        super.move();
        System.out.println("Running move in Chair");
    }

    @Override
    public void paint(){
//        super.paint();
        System.out.println("Running paint in Chair");
    }
}
