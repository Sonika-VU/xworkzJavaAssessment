package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Clothing;
import com.xworkz.isARelation.TShirt;

public class ClothingRunner {

    public static void main(String[] args) {
        Clothing clothing1 = new Clothing();
        Clothing clothing2 = new TShirt();
        TShirt tShirt = new TShirt();

        System.out.println("=========================");
        clothing1.giftIt();
        clothing1.stitch();
        clothing1.tear();
        clothing1.wash();
        clothing1.wear();

        System.out.println("=========================");
        clothing2.giftIt();
        clothing2.stitch();
        clothing2.tear();
        clothing2.wash();
        clothing2.wear();

        System.out.println("=========================");
        tShirt.giftIt();
        tShirt.stitch();
        tShirt.tear();
        tShirt.wash();
        tShirt.wear();

    }
}
