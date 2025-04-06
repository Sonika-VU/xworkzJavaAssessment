package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Chair;
import com.xworkz.isARelation.Furniture;

public class FurnitureRunner {
    public static void main(String[] args) {
        Furniture furniture  = new Furniture();
        Furniture furniture1 = new Chair();
        Chair chair = new Chair();

        System.out.println("====================");
        furniture.disassemble();
        furniture.clean();
        furniture.paint();
        furniture.move();
        furniture.assemble();

        System.out.println("====================");
        furniture1.disassemble();
        furniture1.clean();
        furniture1.paint();
        furniture1.move();
        furniture1.assemble();

        System.out.println("====================");
        chair.disassemble();
        chair.clean();
        chair.paint();
        chair.move();
        chair.assemble();
    }
}
