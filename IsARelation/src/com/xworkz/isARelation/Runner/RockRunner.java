package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Granite;
import com.xworkz.isARelation.Rock;

public class RockRunner {
    public static void main(String[] args) {
        Rock rock = new Rock();
        Rock rock1 = new Granite();
        Granite granite = new Granite();

        System.out.println("==========================");
        rock.provideMinerals();;
        rock.formNaturally();
        rock.appearInDifferentShapes();
        rock.supportStructures();
        rock.withstandWeather();

        System.out.println("==========================");
        rock1.provideMinerals();;
        rock1.formNaturally();
        rock1.appearInDifferentShapes();
        rock1.supportStructures();
        rock1.withstandWeather();

        System.out.println("==========================");
        granite.provideMinerals();;
        granite.formNaturally();
        granite.appearInDifferentShapes();
        granite.supportStructures();
        granite.withstandWeather();
    }
}
