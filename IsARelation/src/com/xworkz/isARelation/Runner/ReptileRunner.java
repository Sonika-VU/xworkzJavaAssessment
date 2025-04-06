package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Reptile;
import com.xworkz.isARelation.Snake;

public class ReptileRunner {
    public static void main(String[] args) {
        Reptile reptile = new Reptile();
        Reptile reptile1 = new Snake();
        Snake snake = new Snake();

        System.out.println("========================");
        reptile.crawl();
        reptile.hide();
        reptile.layEggs();
        reptile.regulateBodyTemperature();
        reptile.shedSkin();

        System.out.println("========================");
        reptile1.crawl();
        reptile1.hide();
        reptile1.layEggs();
        reptile1.regulateBodyTemperature();
        reptile1.shedSkin();

        System.out.println("========================");
        snake.crawl();
        snake.hide();
        snake.layEggs();
        snake.regulateBodyTemperature();
        snake.shedSkin();
    }
}
