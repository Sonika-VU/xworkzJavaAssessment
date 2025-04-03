package com.xworkz.isARelation;

public class TShirt extends Clothing{

    public TShirt(){
        super();
        System.out.println("no-arg const of TShirt");
    }
    {
        super.stitch();
        System.out.println("Running stitch in TShirt");

    }


    {
        super.wear();
        System.out.println("Running wear in TShirt");
    }

    {
        super.tear();
        System.out.println("Running tear in TShirt");
    }

    {
        super.giftIt();
        System.out.println("Running giftIt in TShirt");
    }

    {
        super.wash();
        System.out.println("Running wash in TShirt");
    }

}
