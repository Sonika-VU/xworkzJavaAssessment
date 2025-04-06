package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Desk;
import com.xworkz.isARelation.Furniture;

public class DeskRunner {
    public static void main(String[] args) {
        Furniture furniture = new Furniture();
        Furniture furniture1 = new Desk();
        Desk desk = new Desk();

        System.out.println("========================");
        furniture.move();
        furniture.clean();
        furniture.assemble();
        furniture.paint();
        furniture.disassemble();

        System.out.println("========================");
        furniture1.move();
        furniture1.clean();
        furniture1.assemble();
        furniture1.paint();
        furniture1.disassemble();

        System.out.println("========================");
        desk.move();
        desk.clean();
        desk.assemble();
        desk.paint();
        desk.disassemble();

    }
}
