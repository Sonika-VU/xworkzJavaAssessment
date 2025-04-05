package com.xworkz.isARelation;

public class Bookshelf extends Furniture {
    public Bookshelf() {
        super();
        System.out.println("no-arg const of Bookshelf");
    }

    @Override
            public void assemble(){
//           super.assemble();
        System.out.println("Assembling bookshelf with multiple sections");

    }
    @Override
            public void disassemble(){
//        super.disassemble();
        System.out.println("Disassembling bookshelf for relocation");

    }

        @Override
                public void clean(){
//        super.clean();
            System.out.println("Cleaning bookshelf and organizing books");

        }

    @Override
            public void move(){
//        super.move();
        System.out.println("Moving bookshelf to the study");

    }

        @Override
                public void paint(){
//        super.paint();
        System.out.println("Painting bookshelf in a glossy finish");
    }
}
