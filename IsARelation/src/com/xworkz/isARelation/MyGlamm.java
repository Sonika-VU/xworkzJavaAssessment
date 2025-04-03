package com.xworkz.isARelation;

public class MyGlamm extends LipStick{

    public MyGlamm(){
        super();
        System.out.println("no-arg const of MyGlamm");
    }

    {
        super.apply();
        System.out.println("Running apply in LipStick");
    }

    {
        super.remove();
        System.out.println("Running remove in LipStick");
    }

    {
        super.remove();
        System.out.println("Running prepare in LipStick");
    }

    {
        super.pack();
        System.out.println("Running pack in LipStick");
    }

    {
        super.giftIt();
        System.out.println("Running giftIt in LipStick");
    }
}
