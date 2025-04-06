package com.xworkz.isARelation;

public class SlidingWindow extends Window {
    public SlidingWindow() {
        super();
        System.out.println("no-arg const of SlidingWindow");
    }

    @Override
    public void open(){
//        super.open();
        System.out.println("Sliding open in SlidingWindow");
    }

    @Override
    public void close(){
//        super.close();
        System.out.println("Sliding close in SlidingWindow");
    }

    @Override
    public void allowVentilation(){
//        super.allowVentilation();
        System.out.println("Better ventilation in SlidingWindow");
    }

    @Override
    public void provideView(){
//        super.provideView();
        System.out.println("Wide outside view in SlidingWindow");
    }

    @Override
    public void protectFromWeather(){
//        super.protectFromWeather();
        System.out.println("Better insulation in SlidingWindow");
    }
}
