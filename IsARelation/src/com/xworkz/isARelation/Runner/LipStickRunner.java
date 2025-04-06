package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.LipStick;
import com.xworkz.isARelation.MyGlamm;

public class LipStickRunner {
    public static void main(String[] args) {
        LipStick lipStick = new LipStick();
        LipStick lipStick1 = new MyGlamm();
        MyGlamm myGlamm = new MyGlamm();

        System.out.println("========================");
        lipStick.remove();
        lipStick.apply();
        lipStick.giftIt();
        lipStick.pack();
        lipStick.prepare();

        System.out.println("========================");
        lipStick1.remove();
        lipStick1.apply();
        lipStick1.giftIt();
        lipStick1.pack();
        lipStick1.prepare();

        System.out.println("========================");
        myGlamm.remove();
        myGlamm.apply();
        myGlamm.giftIt();
        myGlamm.pack();
        myGlamm.prepare();

    }
}
