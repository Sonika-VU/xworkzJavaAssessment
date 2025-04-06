package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.SlidingWindow;
import com.xworkz.isARelation.Window;

public class WindowRunner {
    public static void main(String[] args) {
        Window window = new Window();
        Window window1 = new SlidingWindow();
        SlidingWindow slidingWindow = new SlidingWindow();

        System.out.println("============================");
        window.allowVentilation();
        window.open();
        window.protectFromWeather();
        window.provideView();
        window.close();

        System.out.println("============================");
        window1.allowVentilation();
        window1.open();
        window1.protectFromWeather();
        window1.provideView();
        window1.close();

        System.out.println("============================");
        slidingWindow.allowVentilation();
        slidingWindow.open();
        slidingWindow.protectFromWeather();
        slidingWindow.provideView();
        slidingWindow.close();
    }
}
