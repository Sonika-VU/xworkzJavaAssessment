package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Clothing;
import com.xworkz.isARelation.TShirt;

public class TShirtShop {

    public void sell(Clothing clothing){
        clothing.giftIt();
        clothing.stitch();
        clothing.tear();
        clothing.wash();
        clothing.wear();

        if(clothing instanceof TShirt){
            TShirt tShirt = (TShirt) clothing;
            tShirt.dryClean();
        }
    }
}
