package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Butterfly;
import com.xworkz.isARelation.Insect;

public class Garden {

    public void gardening(Insect insect){
        insect.fly();
        insect.feed();
        insect.crawl();
        insect.layEggs();
        insect.senseSurroundings();

        if(insect instanceof Butterfly){
            Butterfly butterfly = (Butterfly) insect;
            butterfly.getNectar();
        }
    }
}
