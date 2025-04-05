package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Bed;
import com.xworkz.isARelation.Furniture;
import com.xworkz.isARelation.Sofa;

public class BedRunner {
    public static void main(String[] args) {
        Furniture furniture = new Furniture();
        Furniture furniture1 = new Bed();
        Bed bed = new Bed();

        furniture.assemble();
        furniture.clean();
        furniture.move();
        furniture.paint();
        furniture.disassemble();

        System.out.println("=========================");

        furniture1.assemble();
        furniture1.clean();
        furniture1.move();
        furniture1.paint();
        furniture1.disassemble();

        System.out.println("=========================");

        bed.assemble();
        bed.clean();
        bed.move();
        bed.paint();
        bed.disassemble();

        System.out.println("=========================");
    }
}
