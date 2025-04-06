package com.xworkz.isARelation;

public class MyGlamm extends LipStick{

    public MyGlamm(){
        super();
        System.out.println("no-arg const of MyGlamm");
    }

    @Override
    public void apply(){
//        super.apply();
        System.out.println("Running apply in LipStick");
    }

    @Override
    public void remove(){
//        super.remove();
        System.out.println("Running remove in LipStick");
    }

    @Override
    public void prepare(){
//        super.prepare();
        System.out.println("Running prepare in LipStick");
    }

    @Override
    public void pack(){
//        super.pack();
        System.out.println("Running pack in LipStick");
    }

    @Override
    public void giftIt(){
//        super.giftIt();
        System.out.println("Running giftIt in LipStick");
    }
}
