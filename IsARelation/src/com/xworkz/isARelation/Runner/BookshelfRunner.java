package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Bookshelf;
import com.xworkz.isARelation.Furniture;

public class BookshelfRunner {
    public static void main(String[] args) {
        Furniture furniture = new Furniture();
        Furniture furniture1  = new Bookshelf();
        Bookshelf bookshelf = new Bookshelf();

        System.out.println("=========================");
        furniture.clean();
        furniture.assemble();
        furniture.move();
        furniture.paint();
        furniture.disassemble();

        System.out.println("=========================");
        furniture1.clean();
        furniture1.assemble();
        furniture1.move();
        furniture1.paint();
        furniture1.disassemble();

        System.out.println("=========================");
        bookshelf.clean();
        bookshelf.assemble();
        bookshelf.move();
        bookshelf.paint();
        bookshelf.disassemble();

    }
}
