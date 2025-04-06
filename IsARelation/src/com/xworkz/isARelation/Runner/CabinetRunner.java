package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Cabinet;
import com.xworkz.isARelation.Furniture;

public class CabinetRunner {
    public static void main(String[] args) {
        Furniture furniture = new Furniture();
        Furniture furniture1 = new Cabinet();
        Cabinet cabinet = new Cabinet();

        System.out.println("=======================");
        furniture.move();
        furniture.disassemble();
        furniture.paint();
        furniture.clean();
        furniture.assemble();

        System.out.println("=======================");
        furniture1.move();
        furniture1.disassemble();
        furniture1.paint();
        furniture1.clean();
        furniture1.assemble();

        System.out.println("=======================");
        cabinet.move();
        cabinet.disassemble();
        cabinet.paint();
        cabinet.clean();
        cabinet.assemble();

    }
}
