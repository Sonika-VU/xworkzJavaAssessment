package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Butterfly;
import com.xworkz.isARelation.Insect;

public class InsectRunner {
    public static void main(String[] args) {
        Insect insect = new Insect();
        Insect insect1 = new Butterfly();
        Butterfly butterfly =  new Butterfly();

        System.out.println("=====================");
        insect.fly();
        insect.feed();
        insect.crawl();
        insect.layEggs();
        insect.senseSurroundings();

        System.out.println("=====================");
        insect1.fly();
        insect1.feed();
        insect1.crawl();
        insect1.layEggs();
        insect1.senseSurroundings();

        System.out.println("=====================");
        butterfly.fly();
        butterfly.feed();
        butterfly.crawl();
        butterfly.layEggs();
        butterfly.senseSurroundings();
    }
}
