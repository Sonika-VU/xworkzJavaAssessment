package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Dresser;
import com.xworkz.isARelation.Furniture;

public class DresserRunner {
    public static void main(String[] args) {
        Furniture furniture = new Furniture();
        Furniture furniture1 = new Dresser();
        Dresser dresser = new Dresser();
        System.out.println("===================");
        furniture.move();
        furniture.assemble();
        furniture.paint();
        furniture.clean();
        furniture.disassemble();

        System.out.println("===================");
        furniture1.move();
        furniture1.assemble();
        furniture1.paint();
        furniture1.clean();
        furniture1.disassemble();

        System.out.println("===================");
        dresser.move();
        dresser.assemble();
        dresser.paint();
        dresser.clean();
        dresser.disassemble();
    }
}
