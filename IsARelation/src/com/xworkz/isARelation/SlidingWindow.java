package com.xworkz.isARelation;

public class SlidingWindow extends Window {
    public SlidingWindow() {
        super();
        System.out.println("no-arg const of SlidingWindow");
    }

    {
        super.open();
        System.out.println("Sliding open in SlidingWindow");
    }

    {
        super.close();
        System.out.println("Sliding close in SlidingWindow");
    }

    {
        super.allowVentilation();
        System.out.println("Better ventilation in SlidingWindow");
    }

    {
        super.provideView();
        System.out.println("Wide outside view in SlidingWindow");
    }

    {
        super.protectFromWeather();
        System.out.println("Better insulation in SlidingWindow");
    }
}
