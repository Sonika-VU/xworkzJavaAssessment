package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Furniture;
import com.xworkz.isARelation.Sofa;

public class SofaRunner {
    public static void main(String[] args) {
        Furniture furniture = new Furniture();
        Furniture furniture1 = new Sofa();
        Sofa sofa = new Sofa();

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
        sofa.disassemble();
        sofa.clean();
        sofa.paint();
        sofa.move();
        sofa.assemble();
    }
}
