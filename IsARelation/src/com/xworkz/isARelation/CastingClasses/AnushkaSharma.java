package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.LipStick;
import com.xworkz.isARelation.MyGlamm;

public class AnushkaSharma {

    public void applyLipstick(LipStick lipStick){
        lipStick.remove();
        lipStick.apply();
        lipStick.giftIt();
        lipStick.pack();
        lipStick.prepare();

        if(lipStick instanceof MyGlamm){
            MyGlamm myGlamm = (MyGlamm) lipStick;
            myGlamm.advertize();
        }
    }
}
