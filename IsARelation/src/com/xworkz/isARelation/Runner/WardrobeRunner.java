package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Furniture;
import com.xworkz.isARelation.Wardrobe;

public class WardrobeRunner {
    public static void main(String[] args) {
        Furniture furniture = new Furniture();
        Furniture furniture1 = new Wardrobe();
        Wardrobe wardrobe = new Wardrobe();


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
        wardrobe.disassemble();
        wardrobe.clean();
        wardrobe.paint();
        wardrobe.move();
        wardrobe.assemble();

    }
}
