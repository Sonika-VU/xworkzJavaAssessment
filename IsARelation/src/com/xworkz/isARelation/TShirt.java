package com.xworkz.isARelation;

public class TShirt extends Clothing{

    public TShirt(){
        super();
        System.out.println("no-arg const of TShirt");
    }

    @Override
    public void stitch(){
//        super.stitch();
        System.out.println("Running stitch in TShirt");

    }

    @Override
    public void wear(){
//        super.wear();
        System.out.println("Running wear in TShirt");
    }

    @Override
    public void tear(){
//        super.tear();
        System.out.println("Running tear in TShirt");
    }

    @Override
    public void giftIt(){
//        super.giftIt();
        System.out.println("Running giftIt in TShirt");
    }

    @Override
    public void wash(){
//        super.wash();
        System.out.println("Running wash in TShirt");
    }

}
