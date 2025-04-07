package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Granite;
import com.xworkz.isARelation.Rock;

public class House {

    public void makeFloor(Rock rock ){
        rock.provideMinerals();;
        rock.formNaturally();
        rock.appearInDifferentShapes();
        rock.supportStructures();
        rock.withstandWeather();

        if(rock instanceof Granite){
            Granite granite = (Granite) rock;
            granite.makeTile();
        }
    }
}
