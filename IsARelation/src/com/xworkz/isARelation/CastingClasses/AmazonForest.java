package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Reptile;
import com.xworkz.isARelation.Snake;

public class AmazonForest {

    public void hasSnake(Reptile reptile){
        reptile.crawl();
        reptile.hide();
        reptile.layEggs();
        reptile.regulateBodyTemperature();
        reptile.shedSkin();

        if(reptile instanceof Snake){
            Snake snake = (Snake) reptile;
            snake.drinkMilk();
        }
    }
}
