package com.xworkz.isARelation;

public class Snake extends Reptile {
    public Snake() {
        super();
        System.out.println("no-arg const of Snake");
    }

    @Override
    public void crawl(){
//        super.crawl();
        System.out.println("Running crawl in Snake");
    }

    @Override
    public void shedSkin(){
//        super.shedSkin();
        System.out.println("Running shedSkin in Snake");
    }

    @Override
    public void layEggs(){
//        super.layEggs();
        System.out.println("Running layEggs in Snake");
    }

    @Override
    public void regulateBodyTemperature(){
//        super.regulateBodyTemperature();
        System.out.println("Running regulateBodyTemperature in Snake");
    }

    @Override
    public void hide(){
        super.hide();
        System.out.println("Running hide in Snake");
    }
}
